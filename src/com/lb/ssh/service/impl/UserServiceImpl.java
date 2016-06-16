package com.lb.ssh.service.impl;

import org.hibernate.HibernateException;

import com.lb.ssh.beans.User;
import com.lb.ssh.dao.BaseDao;
import com.lb.ssh.service.UserService;

public class UserServiceImpl implements UserService {
	private BaseDao userDao;

	public void setUserDao(BaseDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void regUser(User user) throws HibernateException {
		System.out.println("-->用户注册!" + user.toString());
		userDao.saveObject(user);
	}

}
