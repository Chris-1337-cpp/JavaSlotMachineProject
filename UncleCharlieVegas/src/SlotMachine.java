import java.util.*;
public class SlotMachine {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	
	private String name;
	private int slotBalance;// amount of money left in the machine
	private int slotJackpotPayout;//amount of money the jackpot payout is 
	private int jackpotPayouts = 0;//number of times the jackpot has been won
	private int jackpotOdds;
	private int slotRegularPayout;//amount of money the regular payout is
	private int regularPayouts = 0;//number of times the regular has been won
	private int regularOdds;
	static int numSlots = 0;// holds the total number of existing slot machines
	

	public SlotMachine(String name, int slotBalance, int slotJackpotPayout, int jackpotOdds,
			int slotRegularPayout, int regularOdds) {
		setName(name);
		setSlotBalance(slotBalance);
		setSlotJackpotPayout(slotJackpotPayout);
		setJackpotPayouts(jackpotPayouts);
		setJackpotOdds(jackpotOdds);
		setSlotRegularPayout(slotRegularPayout);
		setRegularPayouts(regularPayouts);
		setRegularOdds(regularOdds);
		setNumSlots(this.numSlots + 1);
	}
	
	public SlotMachine() {
		makeSlotMachine();
		setNumSlots(this.numSlots + 1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSlotBalance() {
		return slotBalance;
	}
	public void setSlotBalance(int slotBalance) {
		this.slotBalance = slotBalance;
	}
	public int getSlotJackpotPayout() {
		return slotJackpotPayout;
	}
	public void setSlotJackpotPayout(int slotJackpotPayout) {
		this.slotJackpotPayout = slotJackpotPayout;
	}
	public int getJackpotPayouts() {
		return jackpotPayouts;
	}
	public void setJackpotPayouts(int jackpotPayouts) {
		this.jackpotPayouts = jackpotPayouts;
	}
	public int getJackpotOdds() {
		return jackpotOdds;
	}
	public void setJackpotOdds(int jackpotOdds) {
		this.jackpotOdds = jackpotOdds;
	}
	public int getSlotRegularPayout() {
		return slotRegularPayout;
	}
	public void setSlotRegularPayout(int slotRegularPayout) {
		this.slotRegularPayout = slotRegularPayout;
	}
	public int getRegularPayouts() {
		return regularPayouts;
	}
	public void setRegularPayouts(int regularPayouts) {
		this.regularPayouts = regularPayouts;
	}
	public int getRegularOdds() {
		return regularOdds;
	}
	public void setRegularOdds(int regularOdds) {
		this.regularOdds = regularOdds;
	}
	public static int getNumSlots() {
		return numSlots;
	}
	public static void setNumSlots(int numSlots) {
		SlotMachine.numSlots = numSlots;
	}
	
	
	public void makeSlotMachine() {
		System.out.println("<><><<><><><>Create your Slot machine<><><><><><>");
		System.out.println("Enter your machines Name: ");
		setName(input.nextLine());
		System.out.println("Enter your machines initial balance: ");
		setSlotBalance(input.nextInt());
		System.out.println("Enter your machines jackot payout amount: ");
		setSlotJackpotPayout(input.nextInt());
		System.out.println("Enter your machines jackpot odds ie. 1 in every ______: ");
		setJackpotOdds(input.nextInt());
		System.out.println("Enter your machines regular payout amount");
		setSlotRegularPayout(input.nextInt());
		System.out.println("Enter your machines jackpot odds ie. 1 in every ______: ");
		setRegularOdds(input.nextInt());
		
		
	}//end of makeSlotMachine Method
	
	public void startGambling(Player player) {
		System.out.println("Have reached start gambling function");
		player.setPlayerBalance(player.getPlayerBalance() - 1);// player pays the 1 dollar
		//start random numbers to determine if they are a winner 
		int regularWin = random.nextInt(getRegularOdds() + 1);
		int jackpotWin = random.nextInt(getJackpotOdds() + 1);
		System.out.println("The generated jackpot number is " + jackpotWin);
		System.out.println("The winning jackpot number is " + getJackpotOdds());
		System.out.println("The generated regular number is " + regularWin);
		System.out.println("The winning regular number is " + getRegularOdds());
		
		//if the random number equals the odds
		if(getJackpotOdds() == jackpotWin) {
			System.out.println("Congradulations You Have won the Jackpot");
			//output jackpot design
			//add funds to player 
			//subtract funds from machine
		}
		if(getRegularOdds() == regularWin) {
			System.out.println("you have won the Regular win");
			//output regular design
			//add funds to player 
			//subtract funds from machine
		}
		//one random number number for the jackpot
		//one random number for the regular win
		//add the result to 
	}
	
	
	
	public String toString() {
		String result = null;
		result = "Name: " + getName() + "\n";
		result += "Slot Machine Balance: " + getSlotBalance() + "\n";
		result += "Slot Machine Jackpot Payout: " + getSlotJackpotPayout() + "\n";
		result += "Number of Jackpot payouts given: " + getJackpotPayouts() + "\n";
		result += "Slot Machine Regular Payout: " + getSlotRegularPayout() + "\n";
		result += "Number of regular payouts given: " + getRegularPayouts() + "\n";
		return result;
	}
	

}//end of SlotMachine Class
