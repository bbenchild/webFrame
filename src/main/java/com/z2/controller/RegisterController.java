package com.z2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.z2.bean.User;
import com.z2.service.UserManager;

@Controller 
@RequestMapping 
public class RegisterController {
	@Autowired
	private UserManager userManager;
	@RequestMapping("/register")
	public String login(HttpServletRequest request, User registerUser) {
		System.out.println("register:" + "username:" + registerUser.getName());
		System.out.println("register:" + "password:" + registerUser.getPassword());		
		if (userManager.regUser(registerUser)) {
			return "registersuccess";
		} else {
			return "registerfailure";
		}
	}
}
