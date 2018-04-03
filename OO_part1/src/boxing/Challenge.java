package boxing;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("Scotia Bank");
		
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide", "Tim", 5000.00);
		bank.addCustomer("Adelaide", "Mike", 4005.21);
		bank.addCustomer("Adelaide", "Coad", 123.12);
		
		bank.addBranch("Yonge");
		bank.addCustomer("Yonge", "Bob", 12314.11);
		
		bank.addCustomerTransactions("Adelaide", "Mike", 32123.21);
		bank.addCustomerTransactions("Adelaide", "Tim", 100.00);
		bank.addCustomerTransactions("Adelaide", "Tim", 200.00);
		
		bank.listCustomers("Adelaide", true);
	}

}
