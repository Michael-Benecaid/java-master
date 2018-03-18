package constructor;

import java.nio.DoubleBuffer;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public VipCustomer() {
		this("Tim", 5000.00, "tim@gmail.com");
	}
	
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "unknown");
	}

	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
}
