package com.z2.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/result.do") 
public class ResultController { 


    @RequestMapping 
    public String viewUser(HttpServletRequest request, ModelMap modelMap) 
            throws Exception { 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$you want to check the result.jsp+++++++++++++"); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to insert   +++++++++++++"); 
//        testBusiness.add(); 
        System.out.println("$$$$$$$$$$$$$$$$$$$$$ insert completed +++++++++++++"); 
        return "result"; 
    } 
}