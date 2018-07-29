package sets;

public class Planet extends HeavenlyBody{

	public Planet(String name, double orbintalPeriod) {
		super(name, orbintalPeriod, BodyTypes.PLANET);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean addSatellite(HeavenlyBody moon) {
		if(moon.getKey().getBodyType() == BodyTypes.MOON) {
			return super.addSatellite(moon);
		} else {
			return false;
		}
	}
}
