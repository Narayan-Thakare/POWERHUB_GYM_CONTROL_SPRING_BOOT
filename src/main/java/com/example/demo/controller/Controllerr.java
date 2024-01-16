package com.example.demo.controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Controllerr {
	
	
	
	
	
	
	 @RequestMapping("/test")
	    String myfun(Model m) {

	       

	        return "index.html";
	    }
	
	 
	 @RequestMapping("/test")
	    String myfun1(Model m) {

	       

	        return "index.html";
	    }
	

	 
	 
}
