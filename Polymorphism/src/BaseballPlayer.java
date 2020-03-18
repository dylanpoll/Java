
public class BaseballPlayer extends Athlete{
	
	private String battingPosition;

//constructor
public BaseballPlayer(String name, int age, String team, String position, String battingPosition) {
		super(name, age, team, position);
		this.setBattingPosition(battingPosition);
}
//getters
public String getBattingPosition() {
		return battingPosition;
}
//setters
public void setBattingPosition(String battingPosition) {
		 //Baseball players either bat lefthanded, righthanded or both.
		this.battingPosition = battingPosition;
}
//methods
public void doThis() {
	System.out.println(this.getName() +" hits something.");
// displays I hit something.
}
@Override
public String toString() {
	String extending = super.toString();
	return extending + "Batting Position : " + battingPosition + "\n";
}

}
