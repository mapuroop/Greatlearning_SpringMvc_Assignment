package com.greatlearning.springMvcCrud_Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.greatlearning.springMvcCrud_Assignment.model.Customer;
import com.greatlearning.springMvcCrud_Assignment.dao.CustomerDao;

@Component
@Service
public class CustomerService{
	
	@Autowired
	CustomerDao customerDao;
	
	//add Customer
	public void addcst(Customer customer) {
		customerDao.addcustomer(customer);
	}
	
	//Get all customer
	public List<Customer> getAllcst(){
		return customerDao.getallcustomer();
	}
	
	public Customer getById(Long Id) {
		return customerDao.getStdbyId(Id);
	}

	// update customer
	
		public void updatecst(Customer cst)
		{
			customerDao.Updatecst(cst);
		}
		
		
		//delete employee 
		
		public void deletecst(Long id)
		{
			customerDao.delete(id);
		}
}

