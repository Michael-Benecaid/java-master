package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sets.HeavenlyBody.BodyTypes;

public class Main {
	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);
		
		temp = new Planet("Vernus", 225);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);
		
		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new Moon("Moon", 27);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);
		
        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
        
        System.out.println("Planets");
        for(HeavenlyBody planet: planets) {
        	System.out.println(planet.getKey());
        }
        
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of "+ body.getKey());
        for(HeavenlyBody jupiterMoon : body.getSatellites()) {
        	System.out.println(jupiterMoon.getKey());
        }
         
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
        	moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons");
        for(HeavenlyBody moon: moons) {
        	System.out.println(moon.getKey());
        }
        
        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);
        
        for(HeavenlyBody planet: planets) {
        		System.out.println(planet);
//        		System.out.println(planet.getName() + ": " +planet.getOrbintalPeriod());
        }
        
        Object o = new Object();
        o.equals(o);
        
        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
        
        System.out.println();
        System.out.println("The solar system contains: ");
        for(HeavenlyBody heavenlyBody : solarSystem.values()) {
        		System.out.println(heavenlyBody);
        }
	}

}
