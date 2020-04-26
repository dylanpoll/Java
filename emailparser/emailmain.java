package emailparser;
import java.util.concurrent.TimeUnit;

public class emailmain{
    public static void main(String [] args) throws Throwable {
        try {System.out.println("did you want to update your email address or password or database key? enter 1 to make changes : ");
                int wholeNumber= InputClass.inputInt();
                if (wholeNumber == 1){fileOut.change();}//sends user to update the .env file
                    }catch(Exception e){System.out.println("error updating .env");}

        //this is not working correctly.
        try {System.out.println("Ender 1 if you want to add additional email addresses :");
                int wholeNumber= InputClass.inputInt();
                if (wholeNumber == 1){emailswapper.addemails();}//sends user to update the .env file
                    }catch(Exception e){System.out.println("error adding additional emails");}

            try{
                String[] emailarray = emailList.listedEmails();
                if(emailarray.length>1) {
                    do {for (int i = 0; i <= emailarray.length; i++){
                            System.out.println(i);
                            String email = emailarray[i];
                            i=i+1;
                            String passWord = emailarray[i];
                            emailswapper.change(email, passWord);//swaps out the email credentials.
                            processbuilder.deployNode();//deploys the node file
                        }
                        TimeUnit.SECONDS.sleep(5);//waits 5 minutes and repeats.
                        //TimeUnit.MINUTES.sleep(5);//waits 5 minutes and repeats.
                        System.out.println("restarting");
                    } while (true);}
                }catch(Exception e){
                System.out.println("no emails in email list, using core email.");
                processbuilder.deployNode();//deploys the node file
                TimeUnit.SECONDS.sleep(5);//waits 5 minutes and repeats.
                //TimeUnit.MINUTES.sleep(5);//waits 5 minutes and repeats.
                System.out.println("restarting");
                }

    }//end of main
}//end of class
