package overview;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled high level, object-oriented program language");
		languages.put("Python", "an interpreted, objected-oriented");
		languages.put("Algol", "an algorithmic languge");
		languages.put("BASIC", "Beginner..");
		languages.put("Lisp", "Therein lies madness");
		
//		System.out.println(languages.get("Java"));
//		languages.put("Java", "This course is about java");
		
		if(languages.containsKey("Java")) {
			System.out.println("Java is already here");
		} else {
			languages.put("Java", "This course is about java");
		}
		
		languages.remove("Lisp");
		
		languages.replace("BASIC", "easy language you know");
		
		for(String key: languages.keySet()) {
			System.out.println(key + " : " +languages.get(key));
		}
	}
}
