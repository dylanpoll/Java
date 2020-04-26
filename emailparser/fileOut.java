package emailparser;
import java.nio.file.Path;
import java.nio.file.Paths;
public class fileOut {
	public static void change() {
		String email = "dummy";
		String passWord = "dummy";
		String dbconnector = "dummy";
		Path environmentLocation = Paths.get("emailMongo/.env").toAbsolutePath();
		String file = environmentLocation.toString();
		System.out.println(file);//echos the directory
		FileEditClone changeFile = new FileEditClone();
			try {System.out.println("Enter 1 to change the mongoDB key for this deployment. : ");
					int wholeNumber= InputClass.inputInt();
						if(wholeNumber == 1){
							System.out.println("Please enter the mongoDB key for this deployment : ");
														dbconnector = InputClass.theWord();
										String newLineContent = dbconnector;
										int lineToBeEdited = 1;
										changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);}//updates the first line in the file
										}catch(Exception e){System.out.println("error in updating mongo db key");}

			try{System.out.println("Enter 1 to change the email address for this deployment. : ");
					int wholeNumber= InputClass.inputInt();
						if (wholeNumber == 1){ do{System.out.println("Please enter the email address for this deployment. enter no to skip : ");
														email = InputClass.theWord();}while(emailIsValid(email)==false);
										String newLineContent = ("EMAIL_USER="+email);
										int lineToBeEdited = 2;
										changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);}//updates second line in the file
										}catch(Exception e){System.out.println("error in entering email address");}

			try{System.out.println("Enter 1 to change the password for this deployment. : ");
					int wholeNumber= InputClass.inputInt();
						if (wholeNumber == 1){System.out.println("Please enter the password for this deployment. enter no to skip : ");
														passWord =InputClass.theWord();
										String newLineContent = ("EMAIL_PASS="+passWord);
										int lineToBeEdited = 3;
										changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);}//updates third line in the file
										}catch(Exception e) {System.out.println("error in entering password");}
	}//end main
	static boolean emailIsValid(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(email.matches(regex)){
		return true;
		}
		return false;
	}
}
