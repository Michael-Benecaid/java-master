package oo_challenge;

import javax.xml.parsers.DocumentBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamburger hamburger = new Hamburger("Base", "Sausage", 3.56, "White");
		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddtion1("Tomato", 0.27);
		hamburger.addHamburgerAddtion2("Lettuce", 0.75);
		hamburger.addHamburgerAddtion3("cheese", 1.13);
		price = hamburger.itemizeHamburger();
		System.out.println("Total burger price is "+ hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.itemizeHamburger();
		healthyBurger.addHamburgerAddtion1("egg", 5.43);
		healthyBurger.addHealthyAddtion1("Lentils", 3.41);
		System.out.println("Total price is "+ healthyBurger.itemizeHamburger());
		
		DeluxeBurger deluxeBurger = new DeluxeBurger();
		deluxeBurger.itemizeHamburger();
	}

}
