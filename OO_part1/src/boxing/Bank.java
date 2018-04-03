package boxing;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name){
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	private Branch findBranch(String branchName){
		for(int i=0; i<this.branches.size(); i++){
			Branch checkedBranch = this.branches.get(i);
			if(checkedBranch.getName().equals(branchName)){
				return checkedBranch;
			}
		}
		return null;
	}
	
	public boolean addBranch(String branchName){
		if(findBranch(name) == null){
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount){
		Branch branch = findBranch(branchName);
		if(branch != null){
			return branch.newCustomer(customerName, initialAmount);
		}
		
		return false;
	}
	
	public boolean addCustomerTransactions(String branchName, String customerName, double amount){
		Branch branch = findBranch(branchName);
		if(branch != null){
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	
	public boolean listCustomers(String branchName, boolean showTransactions){
		Branch branch = findBranch(branchName);
		if(branch != null){
			System.out.println("Customers for branch "+ branch.getName());
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i=0; i<branchCustomers.size(); i++){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customers: "+ branchCustomer.getName()+ "["+(i+1)+"]");
				if(showTransactions){
					System.out.println("Transactions: ");
					ArrayList<Double> transactions = branchCustomer.getTransaction();
					for(int j=0; j< transactions.size(); j++){
						System.out.println("["+(j+1)+"] Amount "+ transactions.get(j));
					}
				}
			}
			return true;
		} else{
			return false;
		}
	}
}












