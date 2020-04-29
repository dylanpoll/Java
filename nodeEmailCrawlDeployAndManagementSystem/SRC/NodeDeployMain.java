package emailparser;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class NodeDeployMain {
    public static void main(String[] args) {
        do{
            int wholeNumber=0;
            try {
                String file = "emailList.env";
                String[] listContents = ReadFileGenerateArray.listedEmails(file);
                ArrayList<String> contents = new ArrayList<>();
                ArrayList<String> emailArray = new ArrayList<>();
                int amountOfEmails = ((listContents.length) / 2);

                for (int i=0;i<listContents.length;i++){listContents[i] = listContents[i].replaceAll("\\r|\\n", "");    //isEmpty returns true if the length of the string in it is 0. so if it is "" it will not write it to the arrays
                    if(!listContents[i].isEmpty()){contents.add(listContents[i]);}}                                                 //list length -0 for array bounds, .length is the objects in the array, but it starts at 0

                for (int i=0;i<listContents.length-1;i+=2) {emailArray.add(contents.get(i));}//isEmpty returns true if the length of the string in it is 0. so if it is "" it will not write it to the arrays

                System.out.println("-------------Printing out current list of emails----------------");
                for (int i=0;i<amountOfEmails;i++) {
                    System.out.print("Index @ "+(i+1)+" : ");
                    System.out.println(emailArray.get(i));}//list length -0 for array bounds, .length is the objects in the array, but it starts at 0
                System.out.println("-----------------------------end of list------------------------");

            }catch(Exception e){System.out.println("error at boot...");}


            System.out.println("----------------------configuration menu------------------------");
            System.out.println("update your database key: 		 [1]");
            System.out.println("add additional email addresses : [2]");
            System.out.println("remove email addresses : 		 [3]");
            System.out.println("exit configuration menu : 		 [4]");
            System.out.println("----------------------------------------------------------------");
            System.out.print("enter numeric menu choice : ");
            do{
                try {
                    wholeNumber = InputClass.inputInt();
                    switch (wholeNumber) {
                        case 1:
                            ChangeDBKey.change();
                            main(args);
                        case 2:
                            AddEmails.addEmails();
                            main(args);
                        case 3:
                            RemoveEmails.removeEmail();
                            main(args);
                        case 4:
                            break;
                    }//end switch
                }catch(Exception e){System.out.println("error with choice, re enter : ");}
            }while(wholeNumber!=4);

            try {
                String file = "emailList.env";
                            String[] listContents = ReadFileGenerateArray.listedEmails(file);
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
                for (int i=0;i<amountOfEmails;i++) {
                    System.out.print("Index @ "+(i+1)+" : ");
                    System.out.println(emailArray.get(i));}//list length -0 for array bounds, .length is the objects in the array, but it starts at 0
                System.out.println("-----------------------------end of list------------------------");

                do {
                    try {
                        do {
                            for (int i = 0; i <= amountOfEmails - 1; i++) {// divded by 2 because this array has the email and pass on seperate lines, so the amount of addresses is half the length.
                                String email = emailArray.get(i);
                                if (i == 0) {
                                    System.out.println("checking email account number " + (i + 1) + " out of " + (amountOfEmails) + " : " + email);
                                } else {
                                    System.out.println("checking email account number " + (i) + " out of " + (amountOfEmails) + " : " + email);
                                }
                                String passWord = passwordArray.get(i);
                                CredentialSwapper.change(email, passWord);//swaps out the email credentials.
                                processbuilder.deployNode();//deploys the node file
                                System.out.println(i);
                            }
                            int x = 5;
                            System.out.print("cooling down for 5 seconds... : ");
                            for (int i = 0; i <= 5; i++) {
                                System.out.print("." + x);
                                x--;
                                TimeUnit.SECONDS.sleep(1);
                                System.out.print(".");
                                System.out.print(".");
                            }//waits 5 minutes and repeats.
                            //TimeUnit.MINUTES.sleep(5);//waits 5 minutes and repeats.
                            System.out.println("restarting");
                        } while (true);
                    } catch (Exception e) {
                        System.out.println("error from swap do loop");
                    }
                }while(true);

            }catch(Exception e){System.out.println("error at boot...");}

        }while(true);
    }//end of main
}//end of class
