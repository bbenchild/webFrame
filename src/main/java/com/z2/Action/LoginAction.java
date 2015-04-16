package com.z2.Action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.z2.bean.User;


public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	
	
	private static ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {
			"classpath:spring.xml", "classpath:spring-hibernate.xml" });;

	

	
	private static final long serialVersionUID = -416500284096309064L;
	private User UUU; 
	
	
	public String login() throws Exception {
		System.out.println("username" + UUU.getName());
		if (UUU.getName().equals("struts2")) 
		{    
			SessionFactory sessionFactory = (SessionFactory) ac
					.getBean("sessionFactory");
			// 获取或打开session
			Session session = sessionFactory.openSession();
			// 开启事务处理
			Transaction ts = session.beginTransaction();
			User u = new User();
			u.setId(null);
			u.setName("小明");
			u.setPassword("123");
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
	
	public String register() throws Exception {
		System.out.println("username" + UUU.getName());
		if (UUU.getName().equals("struts2")) 
		{    
			return "registerSuccess";   
		}  
		else 
		{     
			return "registerFailure";   
		} 

	}

	public User getUser() {
		return UUU;
	}

	public void setUser(User user) {
		UUU = user;
	}
	
	public String get(){   return "这是User中的get方法";  } 
	
}
