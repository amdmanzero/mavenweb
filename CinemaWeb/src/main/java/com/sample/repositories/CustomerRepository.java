package com.sample.repositories;

import java.util.List;

import com.sample.domain.Customer;

public interface CustomerRepository {
	List<Customer> getListCustomer() throws Exception;
}
