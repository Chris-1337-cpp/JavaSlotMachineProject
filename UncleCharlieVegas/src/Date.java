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
			try {
				System.out.println("Enter your Date of birth in the Format mm/dd/yyyy");
				verified = validateDate(input.next());
			}catch(Exception r) {
				System.out.println("Wrong entry");
				verified = true;
			}
		}while(!verified);
		
	}//generateDate method
	
	private boolean validateDate(String date) { 
		boolean result = true;
		if(date.charAt(2) == '/' && date.charAt(5) == '/') { // makes sure that the slashes are at there correct spot
			try {
				//converts string to char to string all to turn string into an int *whew*
				setMonth(Integer.parseInt(Character.toString(date.charAt(0)) + Character.toString(date.charAt(1)) ));// MM
				setDay(Integer.parseInt(Character.toString(date.charAt(3)) + Character.toString(date.charAt(4)) )); //DD
				setYear(Integer.parseInt(Character.toString(date.charAt(6)) + Character.toString(date.charAt(7)) + Character.toString(date.charAt(8)) + Character.toString(date.charAt(9)) ));//YYYY
				
				//verify actual date
				switch(getMonth()) { 
				case 1,3,5,7,8,10,12: //for the month with 31 days
					if(getDay() < 32) {
						result = true ;
					}
					break;
				case 2:
					//leap year only, leap year has 29 days 
					boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); 
					if(isLeapYear) {
						result = true;
					}else {
						result = false;
					}
					break;
				default:
					result = true;// for the months with 30 days 
					// all other months
					
				}

				
			}catch(Exception e) {
				System.out.println("Incorrect input try again");
				result = true;
			}
		}else{
			System.out.println("You have entered an incorrect format please try again");
			result = true;
		}
		return result;
	}//validate date method end
	
	
	public boolean leapYearCheck(int year) {
		boolean isLeap = true;
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true){
            //System.out.println(year + " is a Leap Year.");
            return isLeap;
        }else{
            //System.out.println(year + " is not a Leap Year.");
            return isLeap;
            }	
	}
	
	
	
	public String toString() {
		String result = null;
		result =  getMonth() +"/"+  getDay() + "/"+ getYear() + "" ;
		return result;
	}
	
	

}
