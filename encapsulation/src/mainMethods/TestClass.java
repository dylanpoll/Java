package mainMethods;
public class TestClass {
	public static void main(String[] args){
		do {
			menu(); //menu method is a void print
			do {
			try {
				int MenuSelect = InputClass.inputInt();
					switch(MenuSelect){	
						case (1) :
							buyMovie();
							break;
						case (2) :
							buyGame();
							break;
						case (3) :
							footballGameInputPoints();
							break;
						case (4) :
							entertainmentPrint();
							entertainmentFilePrint();
							break;
						case (5) :
							sellBoardGame();
							break;
						case (6) :
							equalGamePrint();
							break;
						case (7) :
							//kill game
							break;
						default :
							System.out.println("Please choose from the numbers on the menu.");
							break;
					}//end switch
			}catch(Exception e){
				System.out.println("main switch error");
			}//end try
			}while(true);
		}while(true);
		
}//end main	
	public static void menu(){
		System.out.print( "[1]Buy a movie\n"
						+ "[2]Buy a game\n"
						+ "[3]Enter results of a Football Game\n"
						+ "[4]Display all types of Entertainment (to both the screen and a text file)\n"
						+ "[5]Sell a board game\n"
						+ "[6]Display all games that are equal\n"
						+ "[7]Quit\n"
						+ "enter number for selection: "); 
		}//end menu	
	public static void buyMovie(){
		
}//end buyMovie
	public static void buyGame(){
		
}//end buyGame
	public static void entertainmentPrint(){
		
}//endprint
	public static void entertainmentFilePrint(){
		
}//end fileprint	
	public static void sellBoardGame(){
		
}//end sellgame	
	public static void footballGameInputPoints(){
		
}//endgameInput	
	public static void equalGamePrint(){
		
}//endgamePrint
}//end class
