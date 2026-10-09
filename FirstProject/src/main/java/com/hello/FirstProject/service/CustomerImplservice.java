package com.hello.FirstProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.FirstProject.entity.Customer;
import com.hello.FirstProject.repo.Customerrepo;

@Service
public class CustomerImplservice  implements  CustomerService{

	@Autowired
	Customerrepo cr;
	@Override
	public Customer createCustomer(Customer c) {
		// TODO Auto-generated method stub
		//cr
		return cr.save(c);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return cr.findAll();//select * from customer
	}

	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletecustomer(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
