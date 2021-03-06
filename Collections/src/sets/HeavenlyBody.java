package sets;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
	private final Key key;
	private final double orbintalPeriod;
	private final Set<HeavenlyBody> satellites;
	
	public enum BodyTypes {
		STAR,
		PLANET,
		DWARF_PLANET,
		MOON,
		COMET,
		ASTEROID
	}
	
	public HeavenlyBody(String name, double orbintalPeriod, BodyTypes bodyType) {
		super();
        this.key = new Key(name, bodyType);
		this.orbintalPeriod = orbintalPeriod;
		this.satellites = new HashSet<>();
	}

	
	public Key getKey() {
		return key;
	}

	public double getOrbintalPeriod() {
		return orbintalPeriod;
	}

	public boolean addSatellite(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if(obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			return this.key.equals(theObject.getKey());
		}
		return false;
	}
	
	@Override
	public final int hashCode() {
		return this.key.hashCode();
	}
	
	public static Key makeKey(String name, BodyTypes bodyType) {
		return new Key(name, bodyType);
	}
	
	@Override
	public String toString() {
		return this.key.name + ": " + this.key.bodyType + ", " + this.orbintalPeriod;
	}
	
	public static final class Key {
		private String name;
		private BodyTypes bodyType;
		
		private Key(String name, BodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}
		
		public String getName() {
			return name;
		}
		
		public BodyTypes getBodyType() {
			return bodyType;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Key key = (Key) obj;
			if(this.name.equals(key.getName())) {
				return this.bodyType == key.getBodyType();
			}
			return false;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.hashCode() + 57 + this.bodyType.hashCode();
		}
		
		@Override
		public String toString() {
			return this.name + ": " + this.bodyType;
		}
	}
}
