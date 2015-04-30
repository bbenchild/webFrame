package com.z2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.z2.bean.User;
import com.z2.service.UserManager;

public class LoginAction extends ActionSupport {

	// private String username;
	private String password;
	private User user;

	private UserManager userManager;

	// private static ApplicationContext ac = new
	// ClassPathXmlApplicationContext(new String[] {
	// "classpath:spring.xml", "classpath:spring-hibernate.xml" });
	//
	//
	// public static void testAc() {
	// ac = new ClassPathXmlApplicationContext(new String[] {
	// "classpath:spring.xml", "classpath:spring-hibernate.xml" });
	// }

	@Override
	public String execute() throws Exception {
		System.out.println("login:" + "username:" + user.getName());
		System.out.println("login:" + "password:" + user.getPassword());		
		if (userManager.checkUser(user)) {
			
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

			return "loginSuccess";
		} else {
			return "loginFailure";
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// public String getUsername() {
	// return username;
	// }
	// public void setUsername(String username) {
	// this.username = username;
	// }

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
