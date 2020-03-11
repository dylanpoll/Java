import java.util.InputMismatchException;
import java.util.Scanner;

public class DataValidation {

	static Scanner scan = new Scanner(System.in);
	
	public static char validateChar(String string) {
		char letter;
		boolean valid = true;
		String temp  = "";
		
		do{
			valid = false;
			try{
			System.out.print(string);
			temp = scan.next();
			} // end try
				catch (InputMismatchException e){
					valid = true;
					System.out.println("Letters only, try again: ");
					scan.next();
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
				number = scan.nextInt();
				} // end try
					catch(InputMismatchException e){
							valid = true;
							System.out.println("Numbers only, try again: ");
							scan.next();
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
				wholeNumber = scan.nextInt();
			} // end try
			catch(InputMismatchException e) {
				valid = true;
				System.out.println("Numbers only, try again: ");
				scan.next();
			} // end catch
	}while(valid);
	
			return wholeNumber;
		} // end getInt
	
	public static String validateString(String string) {
		String word = "";
		boolean valid = true;
		
		do{
			valid = false;
			try{
				System.out.print(string);
				word = scan.nextLine();
				} // end try
				catch(InputMismatchException e) {
						valid = true;
						System.out.println("Invalid input, try again: ");
						scan.next();
					} // end Catch

		}while(valid);
	
		word = word.substring(0, 1).toUpperCase() + word.substring(1);
	return word;
	} // end getString	
}//end class
