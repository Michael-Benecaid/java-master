package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal = new Animal("Animal", 1, 1, 5, 5);
//		Dog dog = new Dog("Yorkie", 8, 30, 2, 4, 1, 20, "long silky");
//		dog.eat();
//		dog.walk();
//		dog.run();
		GT3 gt3 = new GT3(36);
		gt3.steer(30);
		gt3.accelerate(30);
		gt3.accelerate(50);
		gt3.accelerate(-60);
	}

}
