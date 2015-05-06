package com.z2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.z2.bean.User;
import com.z2.service.UserManager;
@Controller 
@RequestMapping 
public class LoginController {

	@Autowired
	private User user;

	@Autowired
	private UserManager userManager;
	@RequestMapping("/login")
	public String login(HttpServletRequest request, ModelMap modelMap) {
		System.out.println("login:" + "username:" + user.getName());
		System.out.println("login:" + "password:" + user.getPassword());		
		if (userManager.checkUser(user)) {
			return "loginsuccess"; //
		}
		else
		{
			return "loginfailure"; //
		}
	}
}