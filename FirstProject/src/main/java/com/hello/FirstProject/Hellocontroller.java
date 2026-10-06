package com.hello.FirstProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("iam from first project sb");
		return "iam from first project sb";
	}
	
}
