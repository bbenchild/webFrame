package com.z2.Action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.webFrame.bean.User;

public class LoginAction extends ActionSupport {
	private String username; 
	private String password;
	
	
	
	private static ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {
			"classpath:spring.xml", "classpath:spring-hibernate.xml" });

	
	public static void testAc() {
		ac = new ClassPathXmlApplicationContext(new String[] {
				"classpath:spring.xml", "classpath:spring-hibernate.xml" });
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("username" + username);
		if (username.equals("struts2")) 
		{    
			
			SessionFactory sessionFactory = (SessionFactory) ac
					.getBean("sessionFactory");
			// 获取或打开session
			Session session = sessionFactory.openSession();
			// 开启事务处理
			Transaction ts = session.beginTransaction();
			User u = new User();
			u.setId(null);
			u.setName("小明2");
			session.save(u);
			ts.commit();
			session.cancelQuery();
			
			return "loginSuccess";   
		}  
		else 
		{     
			return "loginFailure";   
		} 

	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
