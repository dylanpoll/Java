package emailParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class AddEmails {
    public static void addEmails() throws IOException {
        int end = 3, x;
        Path environmentLocation = Paths.get("emailDB/emailList.env").toAbsolutePath();
        String email, passWord, filename = environmentLocation.toString(), file = "emailList.env";

        //generates the arrays to work with
        String[] listContents = ReadFileGenerateArray.makeArray(file);
        ArrayList<String> contents = new ArrayList<>();
        ArrayList<String> passwordArray = new ArrayList<>();
        ArrayList<String> emailArray = new ArrayList<>();

        int amountOfEmails = ((listContents.length) / 2);

        for (int i=0;i<listContents.length;i++){listContents[i] = listContents[i].replaceAll("\\r|\\n", "");    //isEmpty returns true if the length of the string in it is 0. so if it is "" it will not write it to the arrays
            if(!listContents[i].isEmpty()){contents.add(listContents[i]);}}                                                 //list length -0 for array bounds, .length is the objects in the array, but it starts at 0

        //starts on line 1 because it is line 2 and that holds the first password
        for (int i=1;i<listContents.length;i+=2) {passwordArray.add(contents.get(i));}//list length -0 for array bounds, .length is the objects in the array, but it starts at 0

        for (int i=0;i<listContents.length;i+=2) {if(!listContents[i].isEmpty()){emailArray.add(listContents[i]);}}//isEmpty returns true if the length of the string in it is 0. so if it is "" it will not write it to the arrays


        System.out.println("-------------Printing out current list of emails----------------");
        for (int i = 0; i < amountOfEmails; i++) {
            System.out.print("Index @ " + (i + 1) + " : ");
            System.out.println(emailArray.get(i));
        }//list length -0 for array bounds, .length is the objects in the array, but it starts at 0
        System.out.println("-----------------------------end of list------------------------");

        try {
            System.out.println(" enter 0 if you do not want to add new any emails..otherwise type in any other number : ");
            end = InputClass.inputInt();
        } catch (Exception e) {
            System.out.println("error in entering email address");
        }
        if (end != 0) {
            do {
                x = 0;
                try {
                     do {
                            System.out.println("Please enter the email address : ");
                            email = InputClass.theWord();
                                    }while(!emailIsValid(email));//above validates email is an email.

                                            if (!email.isEmpty()) {
                                                emailArray.add(email);
                                                x = 1;}
                                                            }catch(Exception e){System.out.println("error in entering email address");}
                                                                    } while (x == 0);

            try {
                 System.out.println("Please enter the password : ");
                 passWord = InputClass.theWord();
                 passwordArray.add(passWord);
                    }catch(Exception e){System.out.println("error in entering password");}

                         //this will clean out any empty lines
                        for (int i = 0; i < emailArray.size() - 1; i++) {
                            if (emailArray.get(i).equals("")) {
                                emailArray.remove(i);}
                            if (passwordArray.get(i).equals("")) {
                                passwordArray.remove(i);}}

            PrintWriter pw = new PrintWriter(new FileWriter(filename));
            for (int i=0;i<emailArray.size();i++) {//writes all the values over to the file from scratch one by one.
                pw.println(emailArray.get(i));
                pw.println(passwordArray.get(i));
                //this makes it so it doesn't leave a blank spot at the end of the file
            }//reprints the old text file contents line by line.
            pw.close();
        }
    }
    static boolean emailIsValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (email.matches(regex)) {
            return true;
        }
        return false;
    }

}
