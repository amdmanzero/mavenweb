package com.sample.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.domain.Customer;
import com.sample.services.CustomerService;

@Controller
public class MainController {
	public static final Logger logger = Logger.getLogger(MainController.class);
	
	private List<Customer> listCustomer;
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String success(ModelMap model) throws Exception{
		listCustomer = customerService.getListCustomer();
		model.addAttribute("listCustomer", listCustomer);
		return "index";
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}
}
