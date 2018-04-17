package abstraction;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		System.out.println("I am not good at that");
	}
	
}
