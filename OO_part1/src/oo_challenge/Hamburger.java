package oo_challenge;

import javax.xml.parsers.DocumentBuilder;

public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String addtion1Name;
	private double addtion1Price;
	
	private String addtion2Name;
	private double addtion2Price;
	
	private String addtion3Name;
	private double addtion3Price;
	
	private String addtion4Name;
	private double addtion4Price;
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}
	
	public void addHamburgerAddtion1(String name, double price){
		this.addtion1Name = name;
		this.addtion1Price = price;
	}
	
	public void addHamburgerAddtion2(String name, double price){
		this.addtion2Name = name;
		this.addtion2Price = price;
	}
	
	public void addHamburgerAddtion3(String name, double price){
		this.addtion3Name = name;
		this.addtion3Price = price;
	}
	
	public void addHamburgerAddtion4(String name, double price){
		this.addtion4Name = name;
		this.addtion4Price = price;
	}
	
	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger with" + this.meat+ " on a " + this.breadRollType + " roll price is "+ this.price);
		if(this.addtion1Name != null) {
			hamburgerPrice += this.addtion1Price;
			System.out.println("Added "+ this.addtion1Name + " for extra "+ this.addtion1Price);
		}
		if(this.addtion2Name != null) {
			hamburgerPrice += this.addtion2Price;
			System.out.println("Added "+ this.addtion2Name + " for extra "+ this.addtion2Price);
		}
		if(this.addtion3Name != null) {
			hamburgerPrice += this.addtion3Price;
			System.out.println("Added "+ this.addtion3Name + " for extra "+ this.addtion3Price);
		}
		if(this.addtion4Name != null) {
			hamburgerPrice += this.addtion4Price;
			System.out.println("Added "+ this.addtion4Name + " for extra "+ this.addtion4Price);
		}
		
		return hamburgerPrice;
	}
	
	
	
	
}
