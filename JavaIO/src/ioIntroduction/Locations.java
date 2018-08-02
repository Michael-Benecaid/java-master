package ioIntroduction;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location>{
	private static Map<Integer, Location> locations = new HashMap<>();

	public static void main(String[] args) {
		FileWriter locFile = null;
		try {
			locFile = new FileWriter("locations.txt");
			for (Location location: locations.values()) {
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
			}
		} catch (IOException e) {
			System.out.println("In catch block");
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("in finally block");
			try {
				if(locFile != null) {
					System.out.println("Attempting to close locfile");
					locFile.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	static {
		Map<String, Integer> tempExit = new HashMap<String, Integer>();
		locations.put(0, new Location(0, "Computer", tempExit));
		
		tempExit = new HashMap<String, Integer>();
		tempExit.put("W", 2);
		tempExit.put("E", 3);
		tempExit.put("S", 4);
		tempExit.put("N", 5);
//		tempExit.put("Q", 0);
		locations.put(1, new Location(1, "Road", tempExit));
		
		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 5);
		tempExit.put("S", 4);
//		tempExit.put("Q", 0);
		locations.put(2, new Location(2, "Hill", tempExit));
		
		tempExit = new HashMap<String, Integer>();
		tempExit.put("W", 1);
		tempExit.put("Q", 0);
		locations.put(3, new Location(3, "Building", tempExit));
		
		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 1);
		tempExit.put("W", 2);
//		tempExit.put("Q", 0);
		
		tempExit = new HashMap<String, Integer>();
		tempExit.put("S", 1);
		tempExit.put("W", 2);
//		tempExit.put("Q", 0);
		locations.put(4, new Location(4, "Valley", tempExit));
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		// TODO Auto-generated method stub
		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {
		// TODO Auto-generated method stub
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		// TODO Auto-generated method stub
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		locations.clear();
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {
		// TODO Auto-generated method stub
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		// TODO Auto-generated method stub
		return locations.entrySet();
	}
	
}
