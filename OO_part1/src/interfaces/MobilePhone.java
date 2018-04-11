package interfaces;

public class MobilePhone implements ITelephone{
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Mobile phone powered up");
		
	}
	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		if(isOn){
			System.out.println("Now ring" + phoneNumber + " on mobile phone");
		} else {
			System.out.println("Phone is switched off");
		}
		
	}
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging){
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == myNumber && isOn){
			isRinging = true;
			System.out.println("Melody ring");
			
		} else {
			isRinging = false;
			System.out.println("Mobile phone not on or number different");
		}
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	
}
