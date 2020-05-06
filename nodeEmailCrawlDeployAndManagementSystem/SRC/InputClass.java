package nodeDeployment;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputClass {
    static Scanner input = new Scanner(System.in);
    //---words
    static boolean verifyword(String word){//validates string entry
        try{
            word = word.trim();
            if(word == null || word.equals("")){return false;}
            if(!word.matches("[^\n]*")){return false;}
        }catch(InputMismatchException e) {
            System.out.println("Words only, try again: ");}
        return true;
    }//end method
    public static char inputChar(){
        char letter;
        boolean valid = true;
        String temp  = "";
        do{
            valid = false;
            try{
                temp = input.next();
            }catch(InputMismatchException e){
                valid = true;
                System.out.println("Letters only, try again: ");
                input.next();
            } // end catch
        }while(valid);
        temp = temp.toUpperCase();
        letter = temp.charAt(0);
        return letter;
    } // end getChar
    public static String theWord() {
        int i=0;
        int x = 0;
        String word = null;
        do{
            try{
                do {
                    i=1;
                    word = input.nextLine();
                        if(verifyword(word)==true){
                            x=1;
                            }
                    }while(x==0);
                }catch(Exception e){
                    System.out.println("Invalid input, try again: ");
                    i=0;
                    }
            }while(i==0);
        return word;
    }
    //---numbers
    public static double inputDouble(){
        double number = 0;
        boolean valid = true;
        do{
            valid = false;
            try{
                number = input.nextInt();
            }catch(InputMismatchException e){
                valid = true;
                System.out.println("Numbers only, try again: ");
                input.next();
            } // end catch
        }while(valid);
        return number;

    } // end getDouble
    public static int inputInt(){
        int wholeNumber = 0;
        boolean valid = true;
        do{valid = false;
            try{wholeNumber = input.nextInt();
            }catch(InputMismatchException e){
                valid = true;
                System.out.println("Numbers only, try again: ");
                input.nextLine();
            } // end catch
        }while(valid);
        input.nextLine();
        return wholeNumber;
    } // end getInt
}