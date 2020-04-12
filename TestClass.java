package mainMethods;
import entertainment.*;
import game.*;

public class TestClass {
	public static void main(String[] args){
		int MenuSelect = 0;
			do {
				menu();//menu method is a void print
				try {
					MenuSelect = InputClass.inputInt();
					System.out.print("the value of input is : " + MenuSelect);
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
												System.out.println("error");
												}//end try
			}while(MenuSelect != 7);
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
			System.out.println("Enter The Title of The Movie you would like to purchase : ");
				String title = InputClass.theWord();
			System.out.println("Enter the year your purchased movie was released : ");
				int year = InputClass.inputInt();
			System.out.println("Enter the number for the star rating of the movie you are purchasing : ");
				int stars = InputClass.inputInt();
			System.out.println("Enter a Description of the Movie: ");
				String description = InputClass.theWord();
		Movie newEntertainment = new Movie(true, false, Movie.getEntertainment() , title, year, stars,description);
		Movie.userSetArrayList(newEntertainment);//makes the value of the field list equal the local one.
}//end buyMovie
	public static void buyGame(){
		boolean cards;
		boolean dice;
		System.out.println("Enter the title of The board game you would like to purchase : ");
		String title = InputClass.theWord();
		System.out.println("Enter the minimum age needed to play this game : ");
		int minAge = InputClass.inputInt();
		System.out.println("Enter the maximum amount of players this board game has : ");
		int maxPlayers = InputClass.inputInt();
		//need to add the dice and deck of cards but need to make a char validation before. DONE -Connor
		System.out.println("Is This Game Played With\n1.Dice\n2.Cards\n3.Both\n4.None\n");
		int diceOrCards = InputClass.inputInt();
		if(diceOrCards == 1) {
			dice = true;
			cards = false;
		}else if(diceOrCards == 2) {
			dice = false;
			cards = true;
		}else if(diceOrCards == 3) {
			dice = true;
			cards = true;
		}else {
			dice = false;
			cards = false;
		}
		System.out.println("Enter The Description of the Game:");
		String description = InputClass.theWord();
		BoardGame newEntertainment = new BoardGame(true, false, Entertainment.getEntertainment(), minAge, maxPlayers, cards, dice, title, description);
		BoardGame.userSetArrayList(newEntertainment);//makes the value of the field list equal the local one.
		
}//end buyGame	
	public static void entertainmentPrint(){
		for(int i = 0; i < Entertainment.getEntertainment().size(); i++) {
		System.out.println(Entertainment.getEntertainment());
		}
}//endprint
	public static void entertainmentFilePrint(){
		
}//end fileprint	
	public static void sellBoardGame(){
		
}//end sellgame	
	public static void footballGameInputPoints(){
			System.out.println("Enter The Home Team's Name");
				String homeTeam = InputClass.theWord();
			System.out.println("Enter The Away Team's Name");
				String awayTeam = InputClass.theWord();
			System.out.println("Enter The Home Team's Score");
				int homeScore = InputClass.inputInt();
			System.out.println("Enter The Away Team's Score");
				int awayScore = InputClass.inputInt();
				
		FootballGame newEntertainment = new FootballGame(false, true, 20, homeTeam, awayTeam, homeScore, awayScore);
		FootballGame.userSetArrayList(newEntertainment);
}//endgameInput	
	public static void equalGamePrint(){
		
}//endgamePrint
}//end class
