package com.lb.ssh.dao.impl;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lb.ssh.dao.BaseDao;

public class UserDaoImpl extends HibernateDaoSupport implements BaseDao {

	@Override
	public void saveObject(Object obj) throws HibernateException {
		getHibernateTemplate().save(obj);
	}
}
