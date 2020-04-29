package emailparser;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CredentialSwapper {
    public static void change(String email, String passWord) {
        Path environmentLocation = Paths.get("emailMongo/.env").toAbsolutePath();
        String file = environmentLocation.toString();
        ChangeLineInFile changeFile = new ChangeLineInFile();

        String newLineContent = ("EMAIL_USER=" + email);
        int lineToBeEdited = 2;
        changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);//updates second line in the file

        newLineContent = ("EMAIL_PASS=" + passWord);
        lineToBeEdited = 3;
        changeFile.changeALineInATextFile(file, newLineContent, lineToBeEdited);//updates third line in the file
    }
}
