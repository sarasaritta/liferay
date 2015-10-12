package com.iswn.liferay.rh.controller;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.iswn.liferay.rh.domain.Contact;
import com.iswn.liferay.rh.service.ContactService;
import com.liferay.portal.kernel.util.ParamUtil;

@Controller("congerController")
@RequestMapping("VIEW")
public class CongerController    {

	
	@Autowired
	private ContactService contactService;
	
	/*@RenderMapping(params = "render=alternative-view")
    public String alternativeView() {
		
		System.out.println("on est dan login controller");
        
        return "login";
    }*/

	@RenderMapping
	public String listContacts(Map<String, Object> map) {
		map.put("contact", new Contact());
		map.put("contactList", contactService.listContact());
		return "conges";
	}
	
	@RenderMapping(params = "render=conger-view")
    public String alternativeView(Map<String, Object> map) {
		map.put("contact", new Contact());
		map.put("contactList", contactService.listContact());
		System.out.println("on est dan login controller");
        
        return "contact";
    }
	
}
