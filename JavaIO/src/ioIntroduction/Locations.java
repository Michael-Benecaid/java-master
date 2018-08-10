package ioIntroduction;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Locations implements Map<Integer, Location>{
	private static Map<Integer, Location> locations = new LinkedHashMap<>();

	public static void main(String[] args) throws IOException{
//		try (BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
//			 BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))) {
//			for (Location location: locations.values()) {
//				locFile.write(location.getLocationID()+ "," + location.getDescription() + "\n");
//				for(String direction: location.getExists().keySet()) {
//					dirFile.write(location.getLocationID() + ", " + direction + ", " + location.getExists().get(direction) + "\n");
//				}
//			}
//		}
		try(DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("location.dat")))) {
			for(Location location: locations.values()) {
				locFile.writeInt(location.getLocationID());
				locFile.writeUTF(location.getDescription());
				System.out.println("Writing locaiton" + location.getLocationID() + " : " + location.getDescription());
				System.out.println("Writing " + (location.getExists().size() -1) + "exits");
				locFile.writeInt(location.getExists().size() -1);
				for(String direction: location.getExists().keySet()) {
					if(!direction.equals("Q")) {
						System.out.println("\t\t" + direction + ", " + location.getExists().get(direction));
						locFile.writeUTF(direction);
						locFile.writeInt(location.getExists().get(direction));
					}
				}
			}
		}
	}
	static {
		try (DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("location.dat")))) {
			boolean eof = false;
			while(!eof) {
				try {
					Map<String, Integer> exits = new LinkedHashMap<>();
					int locID = locFile.readInt();
					String description  = locFile.readUTF();
					int numExit = locFile.readInt();
					System.out.println("Read locaiton " + locID + " : " + description);
					System.out.println("Found " + numExit + " exits");
					for(int i=0; i<numExit; i++) {
						String direction = locFile.readUTF();
						int destination = locFile.readInt();
						exits.put(direction, destination);
						System.out.println("\t\t" + direction + "," + destination);
					}
					locations.put(locID, new Location(locID, description, exits));
				} catch (EOFException e) {
					// TODO: handle exception
					eof = true;
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IO Exception");
		}
//		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))){
//			scanner.useDelimiter(",");
//			while(scanner.hasNextLine()) {
//				int loc= scanner.nextInt();
//				scanner.skip(scanner.delimiter());
//				String description = scanner.nextLine();
//				System.out.println("Imported : " + loc + ": " + description);
//				Map<String, Integer> tempExit = new HashMap<>();
//				locations.put(loc, new Location(loc, description, tempExit));
//			}
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		try(BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
//			String input;
//			while((input = dirFile.readLine()) != null) {
//				String[] data = input.split(",");
//				int loc= Integer.parseInt(data[0]);
//				String direction = data[1];
//				int destination = Integer.parseInt(data[2]);
//				System.out.println(loc + ": " + direction+ " : " + destination);
//				Location location = locations.get(loc);
//				location.addExit(direction, destination);
//			} 
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} 
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
