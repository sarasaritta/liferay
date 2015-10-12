package com.iswn.liferay.rh.dao;

import java.util.List;

import com.iswn.liferay.rh.domain.Contact;
public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
