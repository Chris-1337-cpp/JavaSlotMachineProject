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
	
	//starts the gambling process for the player verifies thet both the player and machine have money
	public void gamble(SlotMachine machine) {
		System.out.println("Enteredd player gamble");
		boolean playAgain = true;

		do {
			if(getPlayerBalance() > 0 && machine.getSlotBalance() > 0) {
				machine.startGambling(this);//starts the gambling in the machine class
				
				String answer = input.next().toUpperCase();
				if(answer.charAt(0) == 'Y') {
					System.out.println("Character entered is equal to Y: " + Character.toString(Character.toUpperCase(answer.charAt(0))));
					playAgain = true;
				}else {
					System.out.println("Character entered is not equal to Y: " + Character.toString(Character.toUpperCase(answer.charAt(0))));
					playAgain = false;
				}

				
			}else {
				System.out.println("Reached bottom else");
				if(getPlayerBalance() <= 0) {
					System.out.println("This player has no money and can not gamble");
					playAgain = false;
				}
				if(machine.getSlotBalance() <= 0) {
					System.out.println("This machine has no money and can not gamble");
					playAgain = false;
				}
			}
			
		}while(playAgain);

	}//end of gamble method
	
	//creates user defined variable
	public void makePlayer() {
		boolean validation = true;
		System.out.println("<><><><><><><>Create your player<><><><><><><>");
		name = new Name();
		DOB = new Date();
		do {
			try {
				System.out.println("Enter Players starting balance");
				setPlayerBalance(input.nextInt());
				validation = false;
			}catch(Exception z) {
				System.out.println("your input was incorrect please try again");
				input.nextLine();
				validation = true;
			}
		}while(validation);

	}
	
	
	
	public String toString() {
		String result = null;
		result = "Player Name: " + getName().toString() + "\n";
		result += "Player DOB: " + DOB.toString() + "\n";
		result += "Current player Balance: " + getPlayerBalance() + "\n";
		return result;
	}
	
	
	
	

}
