package com.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ContactDao;
import com.model.Contact;
import com.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDao contactDao;
	
	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	public void save(Contact contact) {
		// TODO Auto-generated method stub
		contactDao.save(contact);
	}

	public void delete(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

	public List<Contact> query() {
		// TODO Auto-generated method stub
		return contactDao.query(null);
	}

}
