package com.z2.controller;

import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.z2.bean.User;
import com.z2.service.UserManager;

@Controller 
@RequestMapping 
public class RegisterController {
	
	private Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	private UserManager userManager;
	@RequestMapping("/register")
	public ModelAndView login(HttpServletRequest request, User registerUser) {
		logger.info("register:" + "username:" + registerUser.getName());
		logger.info("register:" + "password:" + registerUser.getPassword());
		ModelAndView mav = new ModelAndView();
//		if(bindingresult.hasErrors()){
//			mav.setViewName("register");
//			return mav;
//		}
		
		if (userManager.regUser(registerUser)) {
			mav.setViewName("registersuccess");
			mav.addObject("user", registerUser);
			return mav;
		} else {
			mav.setViewName("registerfailure");
			mav.addObject("user", registerUser);
			return mav;
		}
	}
}
