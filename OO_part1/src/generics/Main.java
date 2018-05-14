package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
		SoccerPlayer beckham = new SoccerPlayer("beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(backham);
		
		System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//      adelaideCrows.matchResult(baseballTeam, 1, 1);
        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + " ranking: "+ adelaideCrows.ranking());
        System.out.println(melbourne.getName()+ " ranking: " + melbourne.ranking());
        System.out.println(hawthorn.getName()+ " ranking: " + hawthorn.ranking());
        System.out.println(fremantle.getName()+ " ranking: " + fremantle.ranking());
        
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
        
        ArrayList<Team> teams;
        //Collections.sort(teams);
        
	}
	
	private static void printDoubled(ArrayList<Integer> n) {
		for(int i: n) {
			System.out.println(i*2);
		}
	}
}
