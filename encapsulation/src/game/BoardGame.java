package game;
import java.util.ArrayList;
class BoardGame extends Game{
	private int MaximumNumberofPlayers;
	private boolean UsesADeckOfCards;
	private boolean UsesDice;
	
	private static ArrayList<BoardGame> boardgames;//used for file print
//constructor
protected BoardGame(boolean indoors,boolean outdoors,int minimumPlayerAge, int maximumNumberofPlayers, boolean usesADeckOfCards, boolean usesDice) {
		super(indoors, outdoors, minimumPlayerAge);
		MaximumNumberofPlayers = maximumNumberofPlayers;
		UsesADeckOfCards = usesADeckOfCards;
		UsesDice = usesDice;
		setArrayList();
	}
//getters
protected int getMaximumNumberofPlayers() {
		return MaximumNumberofPlayers;
	}
protected boolean isUsesADeckOfCards() {
		return UsesADeckOfCards;
	}
protected boolean isUsesDice() {
		return UsesDice;
	}
//setters
protected void setArrayList(){
	BoardGame addgame = new BoardGame(this.isIndoors(),this.isOutdoors(),this.getMinimumPlayerAge(),this.MaximumNumberofPlayers,
			this.UsesADeckOfCards,this.UsesDice);
	BoardGame.boardgames.add(addgame);
}
protected void setUsesADeckOfCards(boolean usesADeckOfCards) {
		UsesADeckOfCards = usesADeckOfCards;
	}
protected void setUsesDice(boolean usesDice) {
		UsesDice = usesDice;
	}
protected void setMaximumNumberofPlayers(int maximumNumberofPlayers) {
		MaximumNumberofPlayers = maximumNumberofPlayers;
	}
//to-string	
@Override
public String toString() {
		return super.toString()+"BoardGame [MaximumNumberofPlayers=" + MaximumNumberofPlayers + ", UsesADeckOfCards=" + UsesADeckOfCards
				+ ", UsesDice=" + UsesDice + "]";
	}
//methods
public void playGame(){
	
}
public void playInfo(){
	
}
public void purchaseInfo(){
	}
}
