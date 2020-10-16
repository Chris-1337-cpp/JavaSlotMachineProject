import java.util.*;
public class SlotMachine {
	Scanner input = new Scanner(System.in);
	
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
		System.out.println("Create your Slot machine");
		System.out.println("Enter your machines Name: ");
		setName(input.next());
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
