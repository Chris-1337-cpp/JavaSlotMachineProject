import java.util.*;
public class Date {
	Scanner input = new Scanner(System.in);
	private String date;
	private int month;
	private int day;
	private int year;
	
	
	public Date(int month, int day, int year) {
		super();
		//setDate(date);
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public Date() {
		generateDate();
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void generateDate() {
		//validates date 
		boolean verified = true;
		do {
		System.out.println("Enter your Date of birth in the Format mm/dd/yyyy");
		verified = validateDate(input.next());
		}while(verified);
		
	}//generateDate method
	
	private boolean validateDate(String date) {
		boolean result = true;
		if(date.charAt(2) == '/' && date.charAt(5) == '/') { // makes sure that the slashes are at there correct spot
			try {
				//converts string to char to string all to turn string into an int *whew*
				//String test = Character.toString( date.charAt(0) );
				///System.out.println(test);
				setMonth(Integer.parseInt(Character.toString(date.charAt(0)) + Character.toString(date.charAt(1)) ));
				setDay(Integer.parseInt(Character.toString(date.charAt(3)) + Character.toString(date.charAt(4)) ));
				setYear(Integer.parseInt(Character.toString(date.charAt(6)) + Character.toString(date.charAt(7)) + Character.toString(date.charAt(8)) + Character.toString(date.charAt(9)) ));
				
				result = false;
				
			}catch(Exception e) {
				System.out.println("Incorrect input try again");
				result = true;
			}
		}else{
			System.out.println("You have entered an incorrect format please try again");
			result = true;
		}
		return result;
	}
	
	public String toString() {
		String result = null;
		result =  getMonth() + getDay() + getYear() + "" ;
		return result;
	}
	
	

}
