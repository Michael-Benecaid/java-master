package generics;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		ArrayList<Integer> items = new ArrayList<>();
//		items.add(1);
//		items.add(2);
//		items.add(3);
//		items.add(4);
//		items.add(5);
//		
//		printDoubled(items);
		
		FootballPlayer  joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer backham = new SoccerPlayer("beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(backham);
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenTeam = new Team<>("Real Madrid");
		brokenTeam.addPlayer(backham);
		
		System.out.println(adelaideCrows.numPlayers());
		
	}
	
	private static void printDoubled(ArrayList<Integer> n) {
		for(int i: n) {
			System.out.println(i*2);
		}
	}
}
