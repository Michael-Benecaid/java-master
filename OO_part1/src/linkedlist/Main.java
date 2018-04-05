package linkedlist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Tim", 54.44);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(12.12);
		System.out.println("Balance for customer "+ customer.getName() + " is " + customer.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for(int i=0; i< intList.size(); i++) {
			System.out.println(i+ ": "+ intList.get(i));
		}
		
		intList.add(1,2);
		
		for(int i=0; i< intList.size(); i++) {
			System.out.println(i+ ": "+ intList.get(i));
		}
	}

}
