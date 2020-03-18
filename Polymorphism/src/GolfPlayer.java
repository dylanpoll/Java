
public class GolfPlayer extends Athlete{
	private String mainSponser;
	
public GolfPlayer(String name, int age, String team, String position, String mainSponser) {
		super(name, age, team, position);
		this.mainSponser = mainSponser;
}
//----getters
public String getMainSponser() {
		return mainSponser;
}
//----setters
public void setMainSponser(String mainSponser) {
		this.mainSponser = mainSponser;
}

public void doThis() {
	System.out.println(this.getName() +" puts it in the hole......");
}
@Override
public String toString() {
	String extending = super.toString();
	return extending + "Main Sponser : " + mainSponser + "\n";
}
}//end of class
