package com.z2.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.z2.bean.User;
import com.z2.service.UserManager;
@Controller 
@RequestMapping 
public class LoginController {

	private Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	private UserManager userManager;
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, User loginUser) {
		logger.info("login:" + "username:" + loginUser.getName());
		logger.info("login:" + "password:" + loginUser.getPassword());
		ModelAndView mav = new ModelAndView();
		if (userManager.checkUser(loginUser)) {
			mav.setViewName("/loginsuccess");
			mav.addObject("user", loginUser);
			return mav; 
		}
		else{
			mav.setViewName("/loginfailure");
			mav.addObject("user", loginUser);
			return mav; 
		}
	}
}
