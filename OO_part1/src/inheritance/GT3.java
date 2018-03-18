package inheritance;

public class GT3 extends Car{
	private int roadServiceMonth;

	public GT3(int roadServiceMonth) {
		super("GT3", "RWD", 4, 2, 7, false);
		this.roadServiceMonth = roadServiceMonth;
	}
	
	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;
		if(newVelocity == 0) {
			stop();
			changeGear(1);
		} else if(newVelocity > 0 && newVelocity <= 20) {
			changeGear(1);
		} else if(newVelocity > 20 && newVelocity <= 40) {
			changeGear(2);
		} else if(newVelocity > 40 && newVelocity <= 60) {
			changeGear(3);
		} else if(newVelocity > 60 && newVelocity <= 80) {
			changeGear(4);
		} else if(newVelocity > 80 && newVelocity <= 100) {
			changeGear(5);
		} else if(newVelocity > 100 && newVelocity <= 120) {
			changeGear(6);
		} else {
			changeGear(7);
		}
		
		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
}
