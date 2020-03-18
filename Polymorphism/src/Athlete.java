
abstract public class Athlete extends Person{

	//An athlete is a person.  An athlete has a team and position.
	private String team;
	private String position;
//---constructor	
public Athlete(String name, int age, String team, String position) {
		super(name, age);//grabs person
		this.setTeam(team);
		this.position = position;
}
//to-string
@Override
public String toString() {
		String extending = super.toString();
		return extending + "team : " + team + "\n" + "position :" + position + "\n";
}

//----getters
public String getPosition() {
		return position;
}
public String getTeam() {
	return team;
}
//----setters
public void setPosition(String position) {
		this.position = position;
}
public void setTeam(String team) {
	this.team = team;
}	
}
