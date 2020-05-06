package nodeDeployment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SearchTermArrayGenerator {
    public static ArrayList<String> makeTermArray() throws IOException {
        int  x,y,z,a,b = 1;
        Path environmentLocation = Paths.get("emailDB/searchTerms.env").toAbsolutePath();//to write to the searchterms.env
        String filename = environmentLocation.toString();// to write to the searchterms.env
        String file = "terms.json";  //to read the json

        //generates the arrays to work with
        String[] listContents = ReadFileGenerateArray.makeArray(file);//reads the json, turns it into an array
        ArrayList<String> contents = new ArrayList<>();
        ArrayList<String> termsArray = new ArrayList<>();
        for(int i=0;i<listContents.length;i++){listContents[i] = listContents[i].replaceAll("\\r|\\n", "");
            listContents[i] = listContents[i].replaceAll(" ", "");}    //isEmpty returns true if the length of the string in it is 0. so if it is "" it will not write it to the arrays

//example [{"_id":"5ea740bdeb1a1248ac99f5bd","term":"survey"},
    if(listContents.length<=1){
        do{
            try {

                   y = (listContents[0].indexOf(':')+2);

                         x =  (listContents[0].substring(y).indexOf(':')+2);// the plus one shifts the value over to the " after the : just at the start of the term
                                    a = y+x;//adding them to get the start of the term

                                             z = (listContents[0].substring(a).indexOf('"')); // z is the location of the ending " for the term.
                                                    z = (z)+(x+y);// we use it to skip the old search locations

                                                        String temp = listContents[0].substring(a, z);
                                                        String temp2 = listContents[0].substring((z + 1));//the remainder of the string is left intact and transposed as left over
                                                            listContents[0] = temp2;//removes the first term portion

                                                                contents.add(temp);}catch (Exception e){b = 0;}//adds the term to the term array

                                                                    a=0;z=0;x=0;y=0;}while(b==1);}//makes sure there is content in the array slot or it wont write it to the terms array.. redundancy check

        if(listContents.length>1){// for multi line version.
             for(int i = 0; i < listContents.length; i++) {//converts the array into an arrayList and cleans it up

                          y = (listContents[i].indexOf(':')+2);

                             x =  (listContents[i].substring(y).indexOf(':')+2);// the plus one shifts the value over to the " after the : just at the start of the term
                                a = y+x;//adding them to get the start of the term

                                    z = (listContents[i].substring(a).indexOf('"')); // z is the location of the ending " for the term.
                                            z = (z)+(x+y);// we use it to skip the old search locations

                                        //b = ((listContents[i].substring(z).length())-(listContents[i].substring(a).length()));

                                                    contents.add(listContents[i].substring(a,z));}
                                                        a=0;z=0;x=0;y=0;}//adds the term to the term array

        for (int i = 0;i<contents.size();i++){//copies over and formats and breaklines
            termsArray.add(contents.get(i));}//writes all the terms to the terms array

        PrintWriter pw = new PrintWriter(new FileWriter(filename));
        for (int i = 0; i < termsArray.size()-1; i++) {//writes all the values over to the file from scratch one by one.
            pw.println(termsArray.get(i));}//this makes it so it doesn't leave a blank spot at the end of the file reprints the old text file contents line by line.
        pw.print(termsArray.get(termsArray.size()-1));//prints last line without creating a new line at end
        pw.close();
    return termsArray;
    }//end of method
}//end of class