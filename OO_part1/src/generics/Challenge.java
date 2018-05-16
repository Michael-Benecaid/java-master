package generics;

public class Challenge {
	public static void main(String[] args) {
		League<Team<FootballPlayer>> footballLeague = new League<>("AFL");


	    Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
	    Team<FootballPlayer> melbourne = new Team<FootballPlayer>("Melbourne");
	    Team<FootballPlayer> hawthorn = new Team<FootballPlayer>("Hawthorn");
	    Team<FootballPlayer> fremantle = new Team<FootballPlayer>("Fremantle");
	    Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Cubs");

	    hawthorn.matchResult(fremantle, 1, 0);
	    hawthorn.matchResult(adelaideCrows,3,8);
	    adelaideCrows.matchResult(fremantle,2,1);

	    footballLeague.add(adelaideCrows);
	    footballLeague.add(melbourne);
	    footballLeague.add(hawthorn);
	    footballLeague.add(fremantle);

	    footballLeague.showLeagueTable();

	}
}
