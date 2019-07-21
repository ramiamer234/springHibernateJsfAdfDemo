package com.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDao;
import com.model.Book;
import com.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void save(Book book) {
		// TODO Auto-generated method stub
		bookDao.save(book);
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

	public void update(Book book) {
		// TODO Auto-generated method stub

	}

	public List<Book> query() {
		// TODO Auto-generated method stub
		return bookDao.query(null);
	}

}
