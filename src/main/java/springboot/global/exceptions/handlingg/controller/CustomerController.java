package springboot.global.exceptions.handlingg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import springboot.global.exceptions.handlingg.entity.Customer;
import springboot.global.exceptions.handlingg.service.CustomerService;

@RestController
public class CustomerController
{
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/getCustomerInfo/{customerId}")
	public Customer getCustomerInfoByUsingCustId(@PathVariable Integer customerId)
	{
		return customerService.getCustomerDataByusingCustomerId(customerId);
	}
}