package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import com.dao.BaseDao;
import com.dao.BookDao;
import com.model.Book;

@Repository
public class BookHibernateDao extends BaseDao implements BookDao {
	public void save(Book book) {
		// TODO Auto-generated method stub
		//this.getSession().save(book);
		//this.getSession().save(book);
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub

	}

	public void update(Book book) {
		// TODO Auto-generated method stub

	}

	public List<Book> query(String whereSql) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append(" from com.model.Book");
		if(!StringUtils.isEmpty(whereSql)) {
			hql.append(whereSql);
		}
		/*Query query = this.getSession().createQuery(hql.toString());
		List<Book> list = query.list();
		return list;*/
		return null;
	}
}
