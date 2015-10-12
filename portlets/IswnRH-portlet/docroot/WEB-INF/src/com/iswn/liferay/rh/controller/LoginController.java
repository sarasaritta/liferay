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

@Controller("loginController")
@RequestMapping("VIEW")
public class LoginController    {

	
	
	@RenderMapping(params = "render=alternative-view")
    public String alternativeView() {
		
		System.out.println("on est dan login controller");
        
        return "login";
    }


}
