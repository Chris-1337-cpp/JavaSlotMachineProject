import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		
		//create array of slot Machines
		SlotMachine[] machine = new SlotMachine[50];
		
		//create array of players 
		Player[] player = new Player[50];
		
		//create slot machines
		machine[0] = new SlotMachine("Lucky 7",5000,5000,10000,5,10);
		machine[1] = new SlotMachine("Lucky Lotto",55000,75000,100000,25,50);
		machine[2] = new SlotMachine("Purple People Eater",1000,40,50,2,5);
		
		//create default player
		player[0] = new Player(new Name("Monkey","D","Luffy"),new Date(5,5,1999),1000);
		
		do {
			int choice = menue();//outputs menu and takes in the users selection
			switch(choice) {
			case 1:
				//add player
				System.out.println();
				//System.out.println("Selected add a player");/////////////////////////////////////////////////
				player[Player.getPlayerAmount()] = new Player();
				System.out.println("There are now " + Player.getPlayerAmount() + " Players");
				System.out.println();
				break;
			case 2:
				//Add a slot Machine
				//System.out.println("Selected add a slot machine");/////////////////////////////////////////////
				machine[SlotMachine.getNumSlots()] = new SlotMachine();
				System.out.println("There are " + SlotMachine.getNumSlots() + " Slot Machines");
				System.out.println();
				break;
			case 3:
				//Gamble
				System.out.println("Selected Gamble");
				int playerSelection;
				int machineSelection;
				try {
				System.out.println("Select a player...............");
				for(int i = 0; i < Player.getPlayerAmount(); i++) {
					System.out.println("Option "+i+":.................. ");
					System.out.println(player[i]);
				}
				System.out.print(".........................>");
				playerSelection = input.nextInt();
				System.out.println("Select a machine...............");
				for(int i = 0; i < SlotMachine.getNumSlots(); i++) {
					System.out.println("Option ["+i+"]:.................. ");
					System.out.println(machine[i]);
				}
				System.out.print(".........................>");
				machineSelection = input.nextInt();
				player[playerSelection].gamble(machine[machineSelection]);
				}catch(Exception x) {
					System.out.println("Incorrect input");
				}
				break;
			case 4:
				//Quit
				System.out.println("Thank you for visiting Goodbye");
				playing = false;
				break;
			case 5:
				//outputs list of all slot machines and players
				System.out.println("viewing all slot machines and all players");
				System.out.println("viewing all slot machines");
				System.out.println();
				for(int i = 0; i < SlotMachine.getNumSlots();i++) {
					System.out.println(machine[i]);
				}
				System.out.println("viewing all player(s)");
				for(int i = 0; i < Player.getPlayerAmount();i++) {
					System.out.println("I has the value " + i);
					System.out.println(player[i]);
				}
				
				System.out.println("There are: " + Player.getPlayerAmount() + " many players");
				System.out.println("There are: " + SlotMachine.getNumSlots() + " many machines");
				break;
				
			default:
				//incorrect input
				System.out.println("Your input was incorrect Please try again");
				break;
			
			}
			
		}while(playing);
		
		

	}//End of main method
	
	public static int menue() {
		Scanner input = new Scanner(System.in);
		int result;
		
		System.out.println("Main Menu....................");
		System.out.println("[1] Add player");
		System.out.println("[2] Add a slot Machine");
		System.out.println("[3] Gamble");
		System.out.println("[4] Quit");
		System.out.print(" Enter your selection: ");
		result = input.nextInt();
		
		return result;
	}

}//End of test class
