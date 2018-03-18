package inheritance;

public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		// TODO Auto-generated constructor stub
	}
	
	private void chew() {
		System.out.println("dog is chewing");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		chew();
		super.eat();
		
	}
	
	private void moveLegs(int speed){
		System.out.println("Dog's legs moved, speed is "+ speed);
	}
	
	@Override
	public void move(int speed) {
		moveLegs(speed);;
		super.move(speed);
	}
	
	public void walk() {
		System.out.println("dog is walking");
		super.move(5);
	}
	
	public void run() {
		System.out.println("dog is running");
		move(10);
	}
	
}
