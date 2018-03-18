package constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account bobsAccount = new Account("121334", 1000.0, "Bob", "bob@gmail.com", "1234567890");
		bobsAccount.withdraw(100.0);
		bobsAccount.deposit(50.0);
		bobsAccount.withdraw(100.0);
		bobsAccount.deposit(51.0);
		bobsAccount.withdraw(100.0);
		
		Account timsAccount = new Account("Tim","gim@g.com","121344");
		
		VipCustomer vip1 = new VipCustomer();
		System.out.println(vip1.getName());
		
		VipCustomer vip2 = new VipCustomer("Bob", 25000.00);
		System.out.println(vip2.getName());
		
		VipCustomer vip3 = new VipCustomer("Tim", 232300.00, "Tim@gmail.com");
		System.out.println(vip3.getEmailAddress());
	}

}
