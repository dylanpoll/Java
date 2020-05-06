package nodeDeployment;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.io.File;
        import java.nio.file.Path;
        import java.nio.file.Paths;

public class processbuilder{
    public static void deployNode(String command,String word)throws IOException{
        Path mydir=Paths.get("Node").toAbsolutePath();// this pulls the workdirectory and adds \emailMongo at the end
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
        public static void install(String command)throws IOException{
        Path mydir=Paths.get("installers").toAbsolutePath();// this pulls the workdirectory and adds \emailMongo at the end
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.directory(new File(String.valueOf(mydir)));// this sets the directory for CMD to mydir
        processBuilder.command("start cmd /k call " + command);//loads the command buffer for cmd with the command
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
    /*
    CMD [/A | /U] [/Q] [/D] [/E:ON | /E:OFF] [/F:ON | /F:OFF] [/V:ON | /V:OFF] [[/S] [/C | /K] string]
/C Carries out the command specified by string and then terminates
/K Carries out the command specified by string but remains

    import java.io.IOException; class Test { public static void main(String args[]) throws InterruptedException, IOException {
    ProcessBuilder processBuilder = new ProcessBuilder(args[0]); processBuilder.inheritIO(); Process process = processBuilder.start();
     process.waitFor(); } }
     */

}//end class