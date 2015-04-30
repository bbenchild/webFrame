package com.z2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.z2.bean.User;
import com.z2.service.UserManager;

public class RegisterAction extends ActionSupport{
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

	@Override
	public String execute() throws Exception {
		System.out.println("register:" + "username:" + user.getName());
		System.out.println("register:" + "password:" + user.getPassword());
		if (true) {
			userManager.regUser(user);
			// SessionFactory sessionFactory = (SessionFactory) ac
			// .getBean("sessionFactory");
			// // 获取或打开session
			// Session session = sessionFactory.openSession();
			// // 开启事务处理
			// Transaction ts = session.beginTransaction();
			// User u = new User();
			// u.setId(null);
			// u.setName("小明2");
			// session.save(u);
			// ts.commit();
			// session.cancelQuery();

			return "registerSuccess";
		} else {
			return "registerFailure";
		}

	}
}
