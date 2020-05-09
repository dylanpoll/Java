package Deployer;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.File;
        import java.nio.file.Path;
        import java.nio.file.Paths;

public class processbuilder{
    public static void deployNode(String command,String word)throws IOException{
        Path mydir=Paths.get("emailDB").toAbsolutePath();// this pulls the workdirectory and adds \emailMongo at the end
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.directory(new File(String.valueOf(mydir)));// this sets the directory for CMD to mydir
        processBuilder.command(command, word);//loads the command buffer for cmd with the command
            try {
                    Process process = processBuilder.start();//runs the "command" in cmd

                    //the rest reads lines from cmd and repeats them over to java
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                                    while((line = reader.readLine()) != null) {
                                        System.out.println(line);
                                    }
                    int exitCode = process.waitFor();
                    System.out.println("\nExited with error code : " + exitCode);
                        }
                        catch (InterruptedException e){
                                e.printStackTrace();
                                }
    }//end build method
}//end class