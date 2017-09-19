package com.sample.services;

import java.util.List;

import com.sample.domain.Customer;

public interface CustomerService {
	List<Customer> getListCustomer() throws Exception;
}
