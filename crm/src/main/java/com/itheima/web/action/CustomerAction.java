package com.itheima.web.action;

import java.util.List;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

	private CustomerService customerService;
	
	private Customer c = new Customer();
	
	private List<Customer> customerList;
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return c;
	}
	public String findAll(){
		customerList = customerService.findAll();
		return SUCCESS;
	}
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

}
