package com.z2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping 
public class ResultController { 


    @RequestMapping("/result")
    public String viewUser(HttpServletRequest request, ModelMap modelMap) 
            throws Exception { 
    	modelMap.addAttribute("message", "Spring3 MVC 例子");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$you want to check the result.jsp+++++++++++++"); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to insert   +++++++++++++"); 
//        testBusiness.add(); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ insert completed +++++++++++++"); 
        return "result"; 
    } 
    
    @RequestMapping("/result2")
    public String viewUser2(HttpServletRequest request, ModelMap modelMap) 
            throws Exception { 
    	modelMap.addAttribute("message", "Spring3 MVC 例子2");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$you want to check the result.jsp+++++++++++++"); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to insert   +++++++++++++"); 
//        testBusiness.add(); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ insert completed +++++++++++++"); 
        return "result"; 
    } 
}