package abstraction;

public class Challenge {
	public static void main(String[] args) {
		String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		
		String[] data = stringData.split(" ");
		for(String s: data) {
			System.out.println(s);
		}
	}
}
