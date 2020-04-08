package game;
import entertainment.Entertainment;
class Game extends Entertainment{
	private int MinimumPlayerAge;
//constructor
protected Game(boolean indoors,boolean outdoors, int minimumPlayerAge) {
	super(indoors, outdoors);
	MinimumPlayerAge = minimumPlayerAge;
}
//getters
protected int getMinimumPlayerAge() {
	return MinimumPlayerAge;
}
//setters
protected void setMinimumPlayerAge(int minimumPlayerAge) {
	MinimumPlayerAge = minimumPlayerAge;
}
//to-string
@Override
public String toString() {
	return super.toString()+"Game [MinimumPlayerAge=" + MinimumPlayerAge + "]";
}
}
