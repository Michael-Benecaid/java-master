package constructor;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("911 gt3") || validModel.equals("amg gtr")){
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModal() {
		return this.model;
	}
}
