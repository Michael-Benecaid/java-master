package composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dimensions dimensions = new Dimensions(20, 20, 5);
//		Case theCase = new Case("2208", "Dell", "240", dimensions);
//		Monitor monitor = new Monitor("27inch based", "Acer", 27, new Resolution(2540, 1440));		
//		Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");		
//		PC pc = new PC(theCase, monitor, motherboard);		
//		pc.powerUp();
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");
		Celling celling = new Celling(12, "White");
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		Lamp lamp = new Lamp("Classic", false, 75);
		
		Bedroom bedroom = new Bedroom("Tim's bedroom", wall1, wall2, wall3, wall4, celling, bed, lamp);
		bedroom.makeBed();
		bedroom.getLamp().trunOn();
	}

}
