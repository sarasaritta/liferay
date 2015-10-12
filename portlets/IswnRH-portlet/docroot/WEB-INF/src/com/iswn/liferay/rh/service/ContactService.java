package com.iswn.liferay.rh.service;
import java.util.List;

import com.iswn.liferay.rh.domain.Contact;
public interface ContactService {
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
