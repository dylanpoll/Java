package nodeDeployment;

public class Install {
    public static void installSelection(){
        int wholeNumber = 0;
        do{
            System.out.println("----------------------configuration menu------------------------");
            System.out.println("install node : 		                [1]");
            System.out.println("install postman :                   [2]");
            System.out.println("install all node modules : 		    [3]");
            System.out.println("return to main menu : 		        [4]");
            System.out.println("----------------------------------------------------------------");
            System.out.print("enter numeric menu choice : ");
                try {
                    wholeNumber = InputClass.inputInt();
                    switch (wholeNumber) {
                        case 1:
                            processbuilder.install("installnode.bat");//deploys the node file
                            installSelection();
                        case 2:
                            processbuilder.install("installpostman.bat");//deploys the node file
                            installSelection();
                        case 3:
                            processbuilder.install("installNodeModules.bat");//deploys the node file
                            installSelection();
                        case 4:
                            break;
                    }//end switch
                }catch(Exception e){System.out.println("error with choice, re enter : ");}
            }while(wholeNumber!=4);
    }
}
