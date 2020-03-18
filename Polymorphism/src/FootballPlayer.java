
public class FootballPlayer extends Athlete{

	private String specialty;
//constructor
public FootballPlayer(String name, int age, String team, String position, String specialty){
		super(name, age, team, position);
		this.specialty = specialty;
}
@Override
public String toString() {
	String extending = super.toString();
	return extending + "Specialty : " + specialty + "\n";
}
//getters
public String getSpecialty(){
		return specialty;
}
//setters
public void setSpecialty(String specialty){
	//A football player's specialty is either Offense, Defense, or Special Teams.
	this.specialty = specialty;
}
//methods
public void doThis(){
	System.out.println(this.getName() + " tackles something.");
}

}//end of class
