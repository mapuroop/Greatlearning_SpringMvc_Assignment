package com.greatlearning.springMvcCrud_Assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Hello {
	
	@RequestMapping("/")
	public String SayHello() {
		return "main-menu";
	}
	

}