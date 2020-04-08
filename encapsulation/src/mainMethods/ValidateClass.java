package mainMethods;
import java.util.InputMismatchException;
public class ValidateClass {
//----words
static boolean verifyword(String word){//validates string entry
	try{
		word = word.trim();
			if(word == null || word.equals("")){return false;}
					if(!word.matches("[a-zA-Z]*")){return false;}
		}catch(InputMismatchException e) {
			System.out.println("Words only, try again: ");}
return true;
}//end method
public static boolean validateChar(char letter){
	if(Character.toString(letter).matches("^[a-pA-P0-9]*$")) {
			return true;
			}else{
				System.out.println("invalid input please try again : ");
				return false;
				}
} // end getChar
//----numbers
public static boolean validateDouble(String decimalNumber) {
	do{try{Double.parseDouble(decimalNumber);
		    	return true;
				} catch(Exception e) {
					System.out.println("this is not a number with a decimal value.");
					return false;}}while(true);
} // end getDouble
public static boolean validateInt(String wholeNumber){
	try{Integer.parseInt(wholeNumber);
		return true;
	}catch(NumberFormatException e){return false;} 
} // end getInt
}