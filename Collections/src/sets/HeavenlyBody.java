package sets;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
	private final String name;
	private final double orbintalPeriod;
	private final Set<HeavenlyBody> satellites;
	
	public HeavenlyBody(String name, double orbintalPeriod) {
		super();
		this.name = name;
		this.orbintalPeriod = orbintalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbintalPeriod() {
		return orbintalPeriod;
	}

	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	
}
