package com.customer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByCustomerEmail(String customerEmail);

}
