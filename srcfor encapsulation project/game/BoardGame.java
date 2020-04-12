package game;

import java.util.ArrayList;

import entertainment.Entertainment;

public class BoardGame extends Game{
	private int MaximumNumberofPlayers;
	private boolean UsesADeckOfCards;
	private boolean UsesDice;
	private String title;
	private String description;
//constructor
public BoardGame(boolean indoors,boolean outdoors,ArrayList<Entertainment> entertainment,int minimumPlayerAge, int maximumNumberofPlayers,
							boolean usesADeckOfCards, boolean usesDice,String title, String description) {
		super(indoors, outdoors, entertainment, minimumPlayerAge);
		MaximumNumberofPlayers = maximumNumberofPlayers;
		UsesADeckOfCards = usesADeckOfCards;
		UsesDice = usesDice;
		this.description = description;
	}
//getters
public int getMaximumNumberofPlayers() {
		return MaximumNumberofPlayers;
	}
public boolean isUsesADeckOfCards() {
		return UsesADeckOfCards;
	}
public boolean isUsesDice() {
		return UsesDice;
	}
//setters
public void setUsesADeckOfCards(boolean usesADeckOfCards) {
		UsesADeckOfCards = usesADeckOfCards;
	}
public void setUsesDice(boolean usesDice) {
		UsesDice = usesDice;
	}
public void setMaximumNumberofPlayers(int maximumNumberofPlayers) {
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
public static void userSetArrayList(Game newEntertainment){
	Entertainment.entertainment.add(newEntertainment);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
