import java.util.InputMismatchException;
import java.util.Scanner;
public class DataValidation {
static Scanner input = new Scanner(System.in);
public static char validateChar(String string) {
		char letter;
		boolean valid = true;
		String temp  = "";
		
		do{
			valid = false;
			try{
			System.out.print(string);
			temp = input.next();
			} // end try
				catch (InputMismatchException e){
					valid = true;
					System.out.println("Letters only, try again: ");
					input.next();
				} // end catch
		}while(valid);
		
		temp = temp.toUpperCase();			
		letter = temp.charAt(0);
	return letter;
	} // end getChar
public static double validateDouble(String string) {
		double number = 0;
		boolean valid = true;
		
		do{
			valid = false;
			try{
				System.out.print(string);
				number = input.nextInt();
				} // end try
					catch(InputMismatchException e){
							valid = true;
							System.out.println("Numbers only, try again: ");
							input.next();
					} // end catch
		}while(valid);
		
	return number;
	} // end getDouble
public static int validateInt(String string) {
		int wholeNumber = 0;
		boolean valid = true;
		
	do{
			valid = false;
			try{
				System.out.print(string);
				wholeNumber = input.nextInt();
			} // end try
			catch(InputMismatchException e) {
				valid = true;
				System.out.println("Numbers only, try again: ");
				input.next();
			} // end catch
	}while(valid);
	
			return wholeNumber;
		} // end getInt
private static boolean verifyword(String word){
	    word = word.trim();
	    if(word == null || word.equals(""))
	        return false;

	    if(!word.matches("[a-zA-Z]*"))
	        return false;
	    return true;
	}
public static String theWord() {
		int i=0;
		int x = 0;
		String word = "";
		do{
		try{
			do {
			i=1;
			word = input.nextLine();
			if(verifyword(word)==true){
				x=1;
			}
			}while(x==0);
			}
			catch(Exception e){
				System.out.println("Invalid input, try again: ");
				i=0;
			}
			}while(i==0);
		return word;
	}
}//end class
