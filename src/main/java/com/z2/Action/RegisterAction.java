package com.z2.action;

import com.z2.bean.User;
import com.z2.service.UserManager;

public class RegisterAction{
	private User user;

	private UserManager userManager;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String execute() throws Exception {
		System.out.println("register:" + "username:" + user.getName());
		System.out.println("register:" + "password:" + user.getPassword());
		if (userManager.regUser(user)) {
			return "registerSuccess";
		} else {
			return "registerFailure";
		}

	}
}
