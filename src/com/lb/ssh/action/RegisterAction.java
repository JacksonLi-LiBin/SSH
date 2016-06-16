package com.lb.ssh.action;

import com.lb.ssh.beans.User;
import com.lb.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = -6520010216457799958L;

	private User user;

	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 用户注册
	 */
	@Override
	public String execute() throws Exception {
		try {
			userService.regUser(user);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
