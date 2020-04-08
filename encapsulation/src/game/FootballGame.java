package game;
import java.util.ArrayList;
class FootballGame extends Game{
	private String HomeTeamName;
	private String AwayTeamName;
	private int HomeTeamScore;
	private int AwayTeamScore;
	private static ArrayList<FootballGame> football;//used for file print
//constructor
protected FootballGame(boolean indoors,boolean outdoors,int minimumPlayerAge, String homeTeamName, String awayTeamName, int homeTeamScore,
			int awayTeamScore) {
		super(indoors, outdoors, minimumPlayerAge);
		HomeTeamName = homeTeamName;
		AwayTeamName = awayTeamName;
		HomeTeamScore = homeTeamScore;
		AwayTeamScore = awayTeamScore;
		setArrayList();
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
protected void setArrayList(){
	FootballGame addgame = new FootballGame(this.isIndoors(),this.isOutdoors(),this.getMinimumPlayerAge(),this.HomeTeamName,this.AwayTeamName,
			this.HomeTeamScore,this.AwayTeamScore);
	FootballGame.football.add(addgame);
}
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
}
