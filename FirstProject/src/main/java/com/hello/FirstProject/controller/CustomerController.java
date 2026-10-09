package com.hello.FirstProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.FirstProject.entity.Customer;
import com.hello.FirstProject.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
@Autowired
	CustomerService cs;

@PostMapping("/create")
public Customer CreateCustomer(@RequestBody Customer r) {
return cs.createCustomer(r);

}

@GetMapping("/getall")
public List<Customer> getallcustomer() {
return cs.getAllCustomer();

}


@GetMapping("/getall/id")
public List<Customer> getcustomet() {
return cs.getAllCustomer();

}
@GetMapping("/welcome")
public String welc() {
	return "welcome to springboot";
}

}
