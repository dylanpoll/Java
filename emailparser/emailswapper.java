package emailparser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class emailswapper{

	public static void change(String email,String passWord) {
		Path environmentLocation = Paths.get("emailMongo/.env").toAbsolutePath();
		String file = environmentLocation.toString();
		FileEditClone changeFile = new FileEditClone();

			String newLineContent = ("EMAIL_USER="+email);
			int lineToBeEdited = 2;
			changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);//updates second line in the file

			newLineContent = ("EMAIL_PASS="+passWord);
			lineToBeEdited = 3;
			changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);//updates third line in the file
	}
	public static void addemails() throws IOException {
		String email = "dummy";
		String passWord = "dummy";
		Path environmentLocation = Paths.get("emailMongo/emailList.txt").toAbsolutePath();
		String filename = environmentLocation.toString();
		System.out.println(filename);//echos the directory
		FileEditClone changeFile = new FileEditClone();
		String content = new String();
		content = FileEditClone.readFile(filename);
		int linesInFile= FileEditClone.numberOfLinesInFile(content);
		String[] array = FileEditClone.turnFileIntoArrayOfStrings(content,linesInFile);
		System.out.println("enter 1");
		PrintWriter pw = new PrintWriter(new FileWriter(filename));
System.out.println("enter 1");
			for (int i = 0; i <= array.length; i++) {
				pw.println(Arrays.toString(array));}
		System.out.println("enter 2");
				try{do{System.out.println("Please enter the email address for this deployment. enter no to skip : ");
						email = InputClass.theWord();}while(emailIsValid(email)==false);
						String newLineContent = email;
						pw.println(email);
						}catch(Exception e){System.out.println("error in entering email address");}
		System.out.println("enter 3");
				try{System.out.println("Please enter the password for this deployment. enter no to skip : ");
						passWord =InputClass.theWord();
						String newLineContent = passWord;
						pw.println(passWord);
							}catch(Exception e) {System.out.println("error in entering password");}
		pw.close();
	}//end main
	static boolean emailIsValid(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(email.matches(regex)){
			return true;
		}
		return false;
	}
}
