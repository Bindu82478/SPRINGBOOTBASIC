package com.hello.FirstProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.FirstProject.entity.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Integer> {

}
