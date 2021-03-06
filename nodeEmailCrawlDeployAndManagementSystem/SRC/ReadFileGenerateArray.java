package Deployer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileGenerateArray {

    public static String[] makeArray(String file){
        Path environmentLocation = Paths.get("emailDB/"+file).toAbsolutePath();
        String filename = environmentLocation.toString();
        String content = new String();
        content = readFile(filename);
        int numberOfLines = numberOfLinesInFile(content);
        String[] array = turnFileIntoArrayOfStrings(content,numberOfLines);
        return array;
    }

    private static int numberOfLinesInFile(String content) {
        int numberOfLines = 0;
        int index = 0;
        int lastIndex = 0;
        lastIndex = content.length() - 1;
        while (true) {
            if (content.charAt(index) == '\n') {
                numberOfLines++;
            }
            if (index == lastIndex) {
                numberOfLines = numberOfLines + 1;
                break;
            }
            index++;
        }
        return numberOfLines;
    }

    private static String[] turnFileIntoArrayOfStrings(String content, int lines) {
        String[] array = new String[lines];
        int index = 0;
        int tempInt = 0;
        int startIndext = 0;
        int lastIndex = content.length() - 1;
        while (true) {
            if (content.charAt(index) == '\n') {
                tempInt++;
                String temp2 = new String();
                for (int i = 0; i < index - startIndext; i++) {
                    temp2 += content.charAt(startIndext + i);
                }
                startIndext = index;
                array[tempInt - 1] = temp2;
            }
            if (index == lastIndex) {
                tempInt++;
                String temp2 = new String();
                for (int i = 0; i < index - startIndext + 1; i++) {
                    temp2 += content.charAt(startIndext + i);
                    }
                array[tempInt - 1] = temp2;
                break;
            }
            index++;
        }
        return array;
    }
    private static String readFile(String filename) {
        String content = null;
        File file = new File(filename);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        numberOfLinesInFile(content);
        return content;
    }
}