package springboot.global.exceptions.handlingg.entity;

import lombok.Data;

@Data
public class Customer
{
	private Integer customerId;
	private String customerName;
	private Double purchasedAmount;	
	
	public Customer(Integer customerId, String customerName, Double purchasedAmount)
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.purchasedAmount = purchasedAmount;
	}
}