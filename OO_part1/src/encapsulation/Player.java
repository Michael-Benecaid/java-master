package encapsulation;

public class Player {
	public String name;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage){
		this.health = this.health - damage;
	}
}
