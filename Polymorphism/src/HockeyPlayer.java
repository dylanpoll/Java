
public class HockeyPlayer extends Athlete{
	private String stickBrand;
@Override
	public String toString() {
		String extending = super.toString();
		return extending + "Stick Brand: " + stickBrand + "\n";
	}
//constructor
public HockeyPlayer(String name, int age, String team, String position, String stickBrand) {
		super(name, age, team, position);
		this.stickBrand = stickBrand;
}
//getters
public String getStickBrand() {
		return stickBrand;
}
//setters
public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
}
//other methods
public void doThis() {
		// displays I sit in a penalty box.
	System.out.println(this.getName() + " sits in the penalty box.");
}
}//end class
