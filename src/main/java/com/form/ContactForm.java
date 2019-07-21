package com.form;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.model.Contact;
import com.service.BookService;
import com.service.ContactService;

//@ManagedBean和 @Component都可以
@Component
@ViewScoped
public class ContactForm implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8493633778009081135L;
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BookService bookService;

	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public List<Contact> getContactList() {
		List<Contact> list = contactService.query();
		return list;
	}

	public void saveContact() {
		Contact contact = new Contact();
		contact.setName("张飞");
		contact.setAge(30);
		contact.setEmail("yixz@qq.com");
		contactService.save(contact);
	}
}
