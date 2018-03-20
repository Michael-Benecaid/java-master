package polymorphism;

class Movie {
	private String name;
	public Movie(String name){
		this.name = name;
	}
	public String plot() {
		return "No plot here";
	}
	public String getName() {
		return name;
	}
	
}

class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}
	
	@Override
	public String plot(){
		return "A shark eats lots of people";
	}
}

class IndependeceDay extends Movie{
	public IndependeceDay() {
		super("Independence Day");
	}
	
	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie{
	public MazeRunner() {
		super("Maze Runner");
	}
	
	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}

class StarWars extends Movie{
	public StarWars(){
		super("Star Wars");
	}
	
	@Override
	public String plot() {
		return "Imperial Forces try to take over the universe";
	}
}

class Forgetable extends Movie{
	public Forgetable() {
		super("Forgetable");
	}
}

public class Main {
	public static void main(String[] args) {
//		for(int i=1; i< 11; i++) {
//			Movie movie = randomMovie();
//			System.out.println("Movie #"+ i +": "+ movie.getName() + "\n" + "Plot:" + movie.plot() + "\n" );
//		}
		Car car = new Car(4, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Benz amggtr = new Benz(8, "AMG GTR RWD");
		System.out.println(amggtr.startEngine());
		System.out.println(amggtr.accelerate());
		System.out.println(amggtr.brake());
		
		Ford raptor = new Ford(8, "F-150 Raptor");
		System.out.println(raptor.startEngine());
		System.out.println(raptor.accelerate());
		System.out.println(raptor.brake());
	}
	
	public static Movie randomMovie(){
		int randomNumber = (int) (Math.random() * 5) +1;
		System.out.println("Random number generated is "+ randomNumber);
		switch (randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependeceDay();	
		case 3:
			return new MazeRunner();	
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		}
		return null;
	}
}

class Car{
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String startEngine() {
		return "Car -> startEngine()";
	}
	public String brake() {
		return "Car -> brake()";
	}
	public String accelerate() {
		return "Car -> accelerate()";
	}
}

class Benz extends Car{
	public Benz(int cylinders, String name){
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Benz -> startEngine()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Benz -> brake()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Benz -> accelerate()";
	}
	
	
}

class Ford extends Car{
	public Ford(int cylinders, String name){
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Ford -> startEngine()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Ford -> brake()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford -> accelerate()";
	}
	
	
}
















