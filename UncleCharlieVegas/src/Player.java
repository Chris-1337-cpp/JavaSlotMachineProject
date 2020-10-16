import java.util.*;
public class Player {
	Scanner input = new Scanner(System.in);
	
	private Name name;
	private Date DOB;
	private int playerBalance;
	static int playerAmount = 0;
	
	
	
	public Player(Name name, Date dOB, int playerBalance) {
		setName(name);
		setDOB(dOB);
		setPlayerBalance(playerBalance);
		setPlayerAmount(this.playerAmount + 1);
	}
	
	
	public Player() {
		makePlayer();
		setPlayerAmount(this.playerAmount + 1);
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public int getPlayerBalance() {
		return playerBalance;
	}
	public void setPlayerBalance(int playerBalance) {
		this.playerBalance = playerBalance;
	}
	public static int getPlayerAmount() {
		return playerAmount;
	}
	public static void setPlayerAmount(int playerAmount) {
		Player.playerAmount = playerAmount;
	}
	
	
	public void gamble() {
		System.out.println("Gamble function initiated");
	}
	
	
	public void makePlayer() {
		System.out.println("Create your player");
		name = new Name();
		DOB = new Date();
		System.out.println("Enter Players starting balance");
		setPlayerBalance(input.nextInt());
	}
	
	
	public String toString() {
		String result = null;
		result = "Player Name: " + getName().toString() + "\n";
		result += "Player DOB: " + getDOB().toString() + "\n";
		result += "Current player Balance: " + getPlayerBalance() + "\n";
		return result;
	}
	
	
	
	

}
