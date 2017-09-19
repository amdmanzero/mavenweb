package com.sample.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.domain.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	public static final Logger logger = Logger.getLogger(CustomerRepositoryImpl.class);
	
	@Autowired
	NamedParameterJdbcTemplate namedJdbcTemplate;
	
	@Override
	public List<Customer> getListCustomer() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("select * from db_sample.customer cus order by cus.create_date desc limit 0,150");
		List<Customer> listCustomer = namedJdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper<Customer>(Customer.class));
		return listCustomer;
	}

}
