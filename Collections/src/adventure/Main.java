package adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Integer, Location> locations = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
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
		
		Map<String, String> vocabulary = new HashMap<>();
		vocabulary.put("QUIT", "Q");
		vocabulary.put("NORTH", "N");
		vocabulary.put("SOUTH", "S");
		vocabulary.put("WEST", "W");
		vocabulary.put("EAST", "E");
		locations.put(5, new Location(5, "Forest", tempExit));
		
		int loc = 1;
		while(true) {
			System.out.println(locations.get(loc).getDescription());
			if(loc == 0) {
				break;
			}
			Map<String, Integer> exits = locations.get(loc).getExists();
			System.out.print("Available exits are ");
			for(String exit: exits.keySet()){
				System.out.print(exit + ", ");
			}
			System.out.println();
			
			String direction = scanner.nextLine().toUpperCase();
			if(direction.length() > 1) {
				String[] words = direction.split(" ");
				for(String word: words) {
					if(vocabulary.containsKey(word)) {
						direction = vocabulary.get(word);
						break;
					}
				}
			}
			if(exits.containsKey(direction)){
				loc = exits.get(direction);
			} else {
				System.out.println("You cannot go in that direction");
			}
		}
	}

}
