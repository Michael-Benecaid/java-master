package oo_challenge;

public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe", "Sausage & cheese", 14.54, "White");
		// TODO Auto-generated constructor stub
		super.addHamburgerAddtion1("chips", 2.75);
		super.addHamburgerAddtion2("Drink", 1.75);
	}

	@Override
	public void addHamburgerAddtion1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add");
	}

	@Override
	public void addHamburgerAddtion2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add");
	}

	@Override
	public void addHamburgerAddtion3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add");
	}

	@Override
	public void addHamburgerAddtion4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add");
	}
	
	
}
