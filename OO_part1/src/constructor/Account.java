package constructor;

import java.awt.print.PrinterGraphics;

public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
		this("121314", 10.00, "Lao", "l@gmail.com", "11231413");
	}
	
	public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		super();
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}
	
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount > this.balance) {
			System.out.println("Only "+ this.balance + " available. Withdraw not processed");
		} else {
			this.balance -= withdrawAmount;
			System.out.println("Withdraw of " + withdrawAmount + " processed. Remaining balance is " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
}
