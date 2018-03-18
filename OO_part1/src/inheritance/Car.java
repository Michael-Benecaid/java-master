package inheritance;

public class Car extends Vehicle{
	private int wheels;
	private int door;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car(String name, String size, int wheels, int door, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.door = door;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Changed to " + currentGear + " gear");
	}
	
	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Velocity "+ speed+ " direction "+ direction);
	}
	
	
}
