package game;

import entertainment.Entertainment;

public class FootballGame extends Game{
	private String HomeTeamName;
	private String AwayTeamName;
	private int HomeTeamScore;
	private int AwayTeamScore;
//constructor
public FootballGame(boolean indoors,boolean outdoors,int minimumPlayerAge, String homeTeamName, String awayTeamName, int homeTeamScore,
			int awayTeamScore) {
		super(indoors, outdoors, entertainment, minimumPlayerAge);
		HomeTeamName = homeTeamName;
		AwayTeamName = awayTeamName;
		HomeTeamScore = homeTeamScore;
		AwayTeamScore = awayTeamScore;
	}
//getters--
protected String getHomeTeamName() {
		return HomeTeamName;
	}
protected int getAwayTeamScore() {
		return AwayTeamScore;
	}
protected String getAwayTeamName() {
		return AwayTeamName;
	}
protected int getHomeTeamScore() {
		return HomeTeamScore;
	}
//setters--
protected void setAwayTeamName(String awayTeamName) {
		AwayTeamName = awayTeamName;
	}
protected void setHomeTeamScore(int homeTeamScore) {
		HomeTeamScore = homeTeamScore;
	}
protected void setAwayTeamScore(int awayTeamScore) {
		AwayTeamScore = awayTeamScore;
	}
protected void setHomeTeamName(String homeTeamName) {
		HomeTeamName = homeTeamName;
	}
//to-string
@Override
public String toString() {
	return super.toString()+"FootballGame [HomeTeamName=" + HomeTeamName + ", AwayTeamName=" + AwayTeamName + ", HomeTeamScore="
			+ HomeTeamScore + ", AwayTeamScore=" + AwayTeamScore + "]";
}
//methods
public void playGame(){
	
}
public void playInfo(){
	
}
public static void userSetArrayList(Game newEntertainment){
	Entertainment.entertainment.add(newEntertainment);
}
}
