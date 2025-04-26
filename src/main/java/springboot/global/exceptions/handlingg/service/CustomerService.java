package springboot.global.exceptions.handlingg.service;

import org.springframework.stereotype.Service;

import springboot.global.exceptions.handlingg.entity.Customer;
import springboot.global.exceptions.handlingg.exception.CustomerNotFoundException;

@Service
public class CustomerService
{
	public Customer getCustomerDataByusingCustomerId(Integer custId)
	{
		if(custId==97016)
		{
			return new Customer(97016,"Arjun Reddy",134000.0);
		}
		else
		{
			throw new CustomerNotFoundException("Customer Not found with the given id...");
		}
	}
}