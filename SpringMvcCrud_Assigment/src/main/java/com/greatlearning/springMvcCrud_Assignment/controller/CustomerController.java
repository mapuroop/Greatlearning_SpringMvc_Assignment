package com.greatlearning.springMvcCrud_Assignment.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.springMvcCrud_Assignment.model.Customer;
import com.greatlearning.springMvcCrud_Assignment.service.CustomerService;

@Controller


public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@GetMapping("/addCustomer")
	public String addCus() {
		return "add-customer";
	}
	//Add Student Data
	@PostMapping("/insertCustomer")
	public String insertStudent(@ModelAttribute ("insertCustomer") Customer customer) {
		customerservice.addcst(customer);
		return "redirect:/customerReport";
		
	}
	@GetMapping("/customerReport")
	public String loadStudent(Model theModel) {
		theModel.addAttribute("customer", customerservice.getAllcst());
		theModel.addAttribute("title","Customer Report");
		return "customer-report";
		
	}
	
	@GetMapping("/editCustomer/{id}")
	public String editStudent(@PathVariable(value="id") Long id,Model m) {
		Customer cst=customerservice.getById(id);
		m.addAttribute("customer",cst);
		m.addAttribute("title","Edit customer");
		
		return "edit-customer";
	}
	
	@PostMapping("/editCustomer/updateCustomer")
	public String UpdateCustomer(@ModelAttribute("updateCustomer") Customer cst) {
		customerservice.updatecst(cst);
		return "redirect:/customerReport";
		
	}
	
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerservice.deletecst(id);
		 return "redirect:/customerReport";
}
	@GetMapping("/deleteCustomer1/{id}")
	public String deleteCustomer1(@PathVariable Long id) {
		
		 return "delete-customer";
	
}
}
