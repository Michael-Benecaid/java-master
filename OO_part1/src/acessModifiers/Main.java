package acessModifiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account timsAccount = new Account("Tim");
		timsAccount.deposit(1000);
		timsAccount.withdraw(500);
		timsAccount.withdraw(-200);
		timsAccount.deposit(-20);
		timsAccount.calculateBalance();
		
		System.out.println("Balance on account is "+ timsAccount.getBalance());
	}

}
