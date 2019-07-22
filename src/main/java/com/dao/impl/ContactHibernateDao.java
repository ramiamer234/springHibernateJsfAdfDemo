package com.dao.impl;

import java.util.List;

import org.springframework.util.StringUtils;
import com.dao.BaseDao;
import com.dao.ContactDao;
import com.model.Contact;

//@Repository
public class ContactHibernateDao extends BaseDao implements ContactDao {
	public void save(Contact contact) {
		//this.getSession().save(contact);
	}

	public void delete(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

	public List<Contact> query(String whereSql) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append(" from com.model.Contact");
		if(!StringUtils.isEmpty(whereSql)) {
			hql.append(whereSql);
		}
		List<Contact> list = (List<Contact>) this.getHibernateTemplate().find(hql.toString());
		return list;
	}
}
