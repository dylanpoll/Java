package emailParser;

import java.nio.file.Path;
import java.nio.file.Paths;
public class ChangeDBKey {
        public static void change() {
            Path environmentLocation = Paths.get("emailDB/.env").toAbsolutePath();
            String file = environmentLocation.toString(),filename = ".env";
            String[] array = ReadFileGenerateArray.makeArray(filename);
            String dbconnector = array[0].replaceAll("\\r|\\n", "");

            System.out.println("-------------YOUR CURRENT DB KEY----------------");
            System.out.println(dbconnector);
            System.out.println("--------------------end-------------------------");

            try { System.out.println("Enter 1 if you are CERTAIN that you want to change your DB key : ");
                  int wholeNumber= InputClass.inputInt();
                  if(wholeNumber == 1){
                        System.out.println("Please enter the mongoDB key for this deployment : ");
                        dbconnector = InputClass.theWord();
                        ChangeLineInFile changeFile = new ChangeLineInFile();
                        String newLineContent = dbconnector;
                        int lineToBeEdited = 1;
                        changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);//updates the first line in the file
                                        }//end of if
                                            }catch(Exception e){System.out.println("error in updating mongo db key");}
        }//end main
}
