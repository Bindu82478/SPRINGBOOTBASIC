package com.hello.FirstProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.FirstProject.entity.Customer;




@Service
public interface CustomerService {
	
	//create the customerdata
	 public Customer createCustomer(Customer customer);
	//public 
	//ge all customer data
	 public List<Customer> getAllCustomer();
	//get one custoemrdata based on id
	 public Customer getCustomerById(Integer id);
	//update all the customerdata
	 public Customer updateCustomer(Customer customer, Integer id);
	//delete the data from db based on id
	 public void deletecustomer(Integer id);
	

}
