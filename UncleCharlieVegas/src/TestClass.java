import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		slotMachine();
		
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
				//System.out.println("Selected Gamble");
				int playerSelection;
				int machineSelection;
				try {
				System.out.println("Select a player...............");
				System.out.println();
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
				seeYaLater();
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
	
	
	static public void letsGambleText() {
		System.out.println(" /$$                   /$$                                                      /$$       /$$");
		System.out.println("| $$                  | $$                                                     | $$      | $$");
		System.out.println("| $$        /$$$$$$  /$$$$$$   /$$$$$$$        /$$$$$$   /$$$$$$  /$$$$$$/$$$$ | $$$$$$$ | $$  /$$$$$$");
		System.out.println("| $$       /$$__  $$|_  $$_/  /$$_____/       /$$__  $$ |____  $$| $$_  $$_  $$| $$__  $$| $$ /$$__  $$");
		System.out.println("| $$      | $$$$$$$$  | $$   |  $$$$$$       | $$  \\ $$  /$$$$$$$| $$ \\ $$ \\ $$| $$  \\ $$| $$| $$$$$$$$");
		System.out.println("| $$      | $$_____/  | $$ /$$\\____  $$      | $$  | $$ /$$__  $$| $$ | $$ | $$| $$  | $$| $$| $$_____/");
		System.out.println("| $$$$$$$$|  $$$$$$$  |  $$$$//$$$$$$$/      |  $$$$$$$|  $$$$$$$| $$ | $$ | $$| $$$$$$$/| $$|  $$$$$$$");
		System.out.println("|________/ \\_______/   \\___/ |_______/        \\____  $$ \\_______/|__/ |__/ |__/|_______/ |__/ \\_______/");
		System.out.println("                                              /$$  \\ $$ ");
		System.out.println("                                             |  $$$$$$/ ");
		System.out.println("                                              \\______/ ");
		
		
		
	}
	
	static public void youLose() {
		System.out.println("\\ \\ / /__  _   _  | |    ___  ___  ___   _ / /");
		System.out.println(" \\ V / _ \\| | | | | |   / _ \\/ __|/ _ \\ (_) | ");
		System.out.println("  | | (_) | |_| | | |__| (_) \\__ \\  __/  _| | ");
		System.out.println("  |_|\\___/ \\__,_| |_____\\___/|___/\\___| (_) | ");
		System.out.println("                                           \\_\\");
	}
	
	
	static public void jackpotWin() {
		System.out.println("    /$$$$$  /$$$$$$   /$$$$$$  /$$   /$$ /$$$$$$$   /$$$$$$  /$$$$$$$$");
		System.out.println("   |__  $$ /$$__  $$ /$$__  $$| $$  /$$/| $$__  $$ /$$__  $$|__  $$__/");
		System.out.println("      | $$| $$  \\ $$| $$  \\__/| $$ /$$/ | $$  \\ $$| $$  \\ $$   | $$   ");
		System.out.println("      | $$| $$$$$$$$| $$      | $$$$$/  | $$$$$$$/| $$  | $$   | $$   ");
		System.out.println(" /$$  | $$| $$__  $$| $$      | $$  $$  | $$____/ | $$  | $$   | $$   ");
		System.out.println("| $$  | $$| $$  | $$| $$    $$| $$\\  $$ | $$      | $$  | $$   | $$   ");
		System.out.println("|  $$$$$$/| $$  | $$|  $$$$$$/| $$ \\  $$| $$      |  $$$$$$/   | $$   ");
		System.out.println(" \\______/ |__/  |__/ \\______/ |__/  \\__/|__/       \\______/    |__/   ");
		
		System.out.println("   /     | /      \\  /      \\ /  |  /  |/       \\  /      \\ /        |");
		System.out.println("   $$$$$ |/$$$$$$  |/$$$$$$  |$$ | /$$/ $$$$$$$  |/$$$$$$  |$$$$$$$$/ ");
		System.out.println("      $$ |$$ |__$$ |$$ |  $$/ $$ |/$$/  $$ |__$$ |$$ |  $$ |   $$ |   ");
		System.out.println(" __   $$ |$$    $$ |$$ |      $$  $$<   $$    $$/ $$ |  $$ |   $$ |   ");
		System.out.println("/  |  $$ |$$$$$$$$ |$$ |   __ $$$$$  \\  $$$$$$$/  $$ |  $$ |   $$ |   ");
		System.out.println("$$ \\__$$ |$$ |  $$ |$$ \\__/  |$$ |$$  \\ $$ |      $$ \\__$$ |   $$ |   ");
		System.out.println("$$    $$/ $$ |  $$ |$$    $$/ $$ | $$  |$$ |      $$    $$/    $$ |   ");
		System.out.println(" $$$$$$/  $$/   $$/  $$$$$$/  $$/   $$/ $$/        $$$$$$/     $$/    ");
	}
	
	
	static public void youWon() {
		System.out.println(" /$$     /$$                  /$$                         /$$      /$$                    ");
		System.out.println("|  $$   /$$/                 | $/                        | $$  /$ | $$                    ");
		System.out.println(" \\  $$ /$$//$$$$$$  /$$   /$$|_//$$    /$$ /$$$$$$       | $$ /$$$| $$  /$$$$$$  /$$$$$$$ ");
		System.out.println("  \\  $$$$//$$__  $$| $$  | $$  |  $$  /$$//$$__  $$      | $$/$$ $$ $$ /$$__  $$| $$__  $$");
		System.out.println("   \\  $$/| $$  \\ $$| $$  | $$   \\  $$/$$/| $$$$$$$$      | $$$$_  $$$$| $$  \\ $$| $$  \\ $$");
		System.out.println("    | $$ | $$  | $$| $$  | $$    \\  $$$/ | $$_____/      | $$$/ \\  $$$| $$  | $$| $$  | $$");
		System.out.println("    | $$ |  $$$$$$/|  $$$$$$/     \\  $/  |  $$$$$$$      | $$/   \\  $$|  $$$$$$/| $$  | $$");
		System.out.println("    |__/  \\______/  \\______/       \\_/    \\_______/      |__/     \\__/ \\______/ |__/  |__/");
	}
	
	static public void slotMachine() {
		System.out.println("                              .-------.");
		System.out.println("                              |Jackpot|");
		System.out.println("                  ____________|_______|____________");
		System.out.println("                 |  __    __    ___  _____   __    |");
		System.out.println("                 | / _\\  / /   /___\\/__   \\ / _\\   |");
		System.out.println("                 | \\ \\  / /   //  //  / /\\ \\\\ \\  25| ");
		System.out.println("                 | _\\ \\/ /___/ \\_//  / /  \\/_\\ \\ []| ");
		System.out.println("                 | \\__/\\____/\\___/   \\/     \\__/ []|");
		System.out.println("                 |===_______===_______===_______===|");
		System.out.println("                 ||*|\\_     |*| _____ |*|\\_     |*||");
		System.out.println("                 ||*|| \\ _  |*||     ||*|| \\ _  |*||");
		System.out.println("                 ||*| \\_(_) |*||*BAR*||*| \\_(_) |*||");
		System.out.println("                 ||*| (_)   |*||_____||*| (_)   |*|| ");
		System.out.println("                 ||*|_______|*|_______|*|_______|*||(__)");
		System.out.println("                 |===_______===_______===_______===| ||");
		System.out.println("                 ||*| _____ |*|\\_     |*|  ___  |*|| ||");
		System.out.println("                 ||*||     ||*|| \\ _  |*| |_  | |*|| ||");
		System.out.println("                 ||*||*BAR*||*| \\_(_) |*|  / /  |*|| ||");
		System.out.println("                 ||*||_____||*| (_)   |*| /_/   |*|| ||");
		System.out.println("                 ||*|_______|*|_______|*|_______|*||_//");
		System.out.println("                 |===_______===_______===_______===|_/");
		System.out.println("                 ||*|  ___  |*|   |   |*| _____ |*||");
		System.out.println("                 ||*| |_  | |*|  / \\  |*||     ||*||");
		System.out.println("                 ||*|  / /  |*| /_ _\\ |*||*BAR*||*|| ");
		System.out.println("                 ||*| /_/   |*|   O   |*||_____||*|| ");
		System.out.println("                 ||*|_______|*|_______|*|_______|*||");
		System.out.println("                 |lc=___________________________===|");
		System.out.println("                 |  /___________________________\\  |");
		System.out.println("                 |   |                         |   |");
		System.out.println("                _|    \\_______________________/    |_");
		System.out.println("               (_____________________________________)");
	}
	
	
	static public void seeYaLater() {
		
		System.out.println("    /$$                                                        /$$             /$$                                /$$$$$$  /$$                           /$$ /$$ ");
		System.out.println("  /$$$$$$                                                     | $$            | $$                               /$$__  $$| $$                          | $$|__/  ");
		System.out.println(" /$$__  $$  /$$$$$$   /$$$$$$        /$$   /$$  /$$$$$$       | $$  /$$$$$$  /$$$$$$    /$$$$$$   /$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ | $$ /$$  /$$$$$$");
		System.out.println("| $$  \\__/ /$$__  $$ /$$__  $$      | $$  | $$ |____  $$      | $$ |____  $$|_  $$_/   /$$__  $$ /$$__  $$      | $$      | $$__  $$ |____  $$ /$$__  $$| $$| $$ /$$__  $$");
		System.out.println("|  $$$$$$ | $$$$$$$$| $$$$$$$$      | $$  | $$  /$$$$$$$      | $$  /$$$$$$$  | $$    | $$$$$$$$| $$  \\__/      | $$      | $$  \\ $$  /$$$$$$$| $$  \\__/| $$| $$| $$$$$$$$");
		System.out.println(" \\____  $$| $$_____/| $$_____/      | $$  | $$ /$$__  $$      | $$ /$$__  $$  | $$ /$$| $$_____/| $$            | $$    $$| $$  | $$ /$$__  $$| $$      | $$| $$| $$_____/");
		System.out.println(" /$$  \\ $$|  $$$$$$$|  $$$$$$$      |  $$$$$$$|  $$$$$$$      | $$|  $$$$$$$  |  $$$$/|  $$$$$$$| $$            |  $$$$$$/| $$  | $$|  $$$$$$$| $$      | $$| $$|  $$$$$$$");
		System.out.println("|  $$$$$$/ \\_______/ \\_______/       \\____  $$ \\_______/      |__/ \\_______/   \\___/   \\_______/|__/             \\______/ |__/  |__/ \\_______/|__/      |__/|__/ \\_______/");
		System.out.println(" \\_  $$_/                            /$$  | $$  ");
		System.out.println("   \\__/                             |  $$$$$$/    ");
		
	}
	
	
	

}//End of test class
