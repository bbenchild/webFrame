package com.z2.Action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username; 
	private String password;
	@Override
	public String execute() throws Exception {
		System.out.println("username" + username);
		if (username.equals("struts2")) 
		{    
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
