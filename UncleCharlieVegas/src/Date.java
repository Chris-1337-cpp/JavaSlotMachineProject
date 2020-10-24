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
		}while(verified);
		
	}//generateDate method
	
	private boolean validateDate(String date) {
		boolean result = true;
		if(date.charAt(2) == '/' && date.charAt(5) == '/') { // makes sure that the slashes are at there correct spot
			try {
				//converts string to char to string all to turn string into an int *whew*
				setMonth(Integer.parseInt(Character.toString(date.charAt(0)) + Character.toString(date.charAt(1)) ));
				setDay(Integer.parseInt(Character.toString(date.charAt(3)) + Character.toString(date.charAt(4)) ));
				setYear(Integer.parseInt(Character.toString(date.charAt(6)) + Character.toString(date.charAt(7)) + Character.toString(date.charAt(8)) + Character.toString(date.charAt(9)) ));
				
				//verify actual date
				if( getMonth() > 0 && getDay() > 0 && getYear() > 0) {// stops any negative numbers
					if(getMonth() <13 && getDay() < 32) {//stops any date over 31 and any month over 12
						if(getMonth() % 2 == 0 && getDay() < 31) {//months that have less than 30 days
							if(!leapYearCheck(getYear()) && getDay() > 28) {
								result = true;
							}else{
								result = false;
							}
						}
						if(getMonth() % 2 == 1 && getDay() < 32) {// months that have more than 30 days
							result = false;
						}

					}else {
						result = true;
					}
					
				}else {
					result = true;
				}
				//make sure date is not under 21
				
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
