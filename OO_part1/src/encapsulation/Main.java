package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Player player = new Player();
//		player.name = "Tim";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage= 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
//		int damage1= 11;
//		player.loseHealth(damage1);
//		System.out.println("Remaining health = " + player.healthRemaining());
		
		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 250, "Sword");
		System.out.println("Initial health is "+ enhancedPlayer.getHealth());
		
		Printer printer = new Printer(50, true);
		System.out.println("Initial page count = "+ printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Page printed was "+ pagesPrinted + " new tolta print count for printer is " + printer.getPagesPrinted());
		int pagesPrinted2 = printer.printPages(7);
		System.out.println("Page printed was "+ pagesPrinted2 + " new tolta print count for printer is " + printer.getPagesPrinted());
	}

}
