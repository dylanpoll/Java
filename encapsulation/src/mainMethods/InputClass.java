package mainMethods;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputClass {
//---words
public static char inputChar(){
	Scanner in = new Scanner(System.in);//opens the scanner
	int i=0;
	char letter = 'x';
	try{do{letter = in.next().charAt(0);//takes input for the double as a string 
				if(ValidateClass.validateChar(letter)==true){//checks for numbers in string
					i=1;}//argument met, code moves on
						}while(i==0);
									}catch(InputMismatchException e){
										System.out.println("Letters only, try again: ");
										} // end catch
	in.close();//closes the scanner
return letter;
} // end getChar
public static String theWord() {
	Scanner in = new Scanner(System.in);//opens the scanner
	int i=0;
	String word = "";
	do{word = in.nextLine();//input word
			if(ValidateClass.verifyword(word)==true){
					i=1;}//argument met, code moves on
						}while(i==0);
	in.close();//closes the scanner
return word;
}
//---numbers
public static double inputDouble(){
	Scanner in = new Scanner(System.in);//opens the scanner
	double number = 0;
	int i=0,x = 0;
	String numberDouble = "blank";
		do{do{i=1;
				numberDouble = in.nextLine();//takes input for the double as a string 
					if(ValidateClass.validateInt(numberDouble)==true){//checks for numbers in string
						x=1;}//argument met, code moves on
			}while(x==0);
		}while(i==0);
number = Double.parseDouble(numberDouble);//uses a built in method to convert string data into a double
in.close();//closes the scanner
return number;
} // end getDouble
public static int inputInt(){
	Scanner in = new Scanner(System.in);//opens the scanner
	int i=0,x = 0,number = 0;
	String wholeNumber = "blank";
	do{do{i=1;
			wholeNumber = in.nextLine();//takes input for the int as a string 
				if(ValidateClass.validateInt(wholeNumber)==true){//checks for numbers in string
					x=1;}//argument met, code moves on
		}while(x==0);
	}while(i==0);
number = Integer.parseInt(wholeNumber);//uses a built in method to convert string data into a int
in.close();//closes the scanner
return number;
} // end getInt
}
