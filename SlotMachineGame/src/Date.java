public class Date {
	private int day;
	private int month;
	private int year;
//----for building
public Date() {
		addDate();
		}
public void addDate(){
			int day, month,year;
			boolean valid = true;
		do{
			year = DataValidation.validateInt(" enter in the year as a 4 digit whole number : ");
			month = DataValidation.validateInt(" enter in the month as a 2 digit whole number : ");
			day = DataValidation.validateInt("Enter the day as a whole number : ");
			valid = validateDate(year, month, day);
		}while(valid);
		
	setYear(year);
	setMonth(month);
	setDay(day);
	} // end addDate
//----Constructor
public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
//------getters
public int getDay() {
		return day;
	}
public int getYear() {
	return year;
}
public int getMonth() {
		return month;
	}
//---setters
public void setMonth(int month) {
		this.month = month;
	}
public void setDay(int day) {
	this.day = day;
	}
public void setYear(int year) {
		this.year = year;
	}
//------validation
public static boolean validateDate(int year, int month, int day) {
	boolean valid = false;
	boolean leapYear = false;
	int daysIn = 0;		
	
	leapYear = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
	if(month > 12 || month < 1) {
			System.out.println("Please enter a valid month (1-12)");
			return true;
			} // end if
				daysIn = monthDays(month, leapYear);
				if(day < 1 || day > daysIn) {
						System.out.println("Invalid date. That month has " + daysIn + " days.");
						return true;
						} // end if
	return valid;
	} // end validateDate
//------validation
public static int monthDays(int month, boolean leapYear) {
	int days = 0;
	
	if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		days = 31;
			else if(month == 2) {
					if(leapYear)
						days = 29;
						else
							days = 28;
						}else{
							days = 30;
					}
	return days;
	} // end monthDays
//------toString
public String toString() {
	return month + "/" + day + "/" + year;
}
}//end class