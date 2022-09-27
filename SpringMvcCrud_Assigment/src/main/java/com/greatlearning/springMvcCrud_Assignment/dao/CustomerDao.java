package com.greatlearning.springMvcCrud_Assignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.springMvcCrud_Assignment.model.Customer;

@Component
public class CustomerDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	// Add Customer
	@Transactional
	public void addcustomer(Customer customer) {
		hibernateTemplate.save(customer);
	}
	
	//get all customers
	public List<Customer> getallcustomer(){
		return hibernateTemplate.loadAll(Customer.class);
	}
	
	//get customer by id
	public Customer getStdbyId(Long id) {
		return hibernateTemplate.get(Customer.class, id);
	}
	
	//Update customer
	@Transactional
	public void Updatecst(Customer customer)
	{
		hibernateTemplate.update(customer);
	}
	//Delete customer
	@Transactional
	public void delete(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Customer.class, id));
	}

	
}


