package game;
import java.util.ArrayList;

import entertainment.Entertainment;
class Game extends Entertainment{
	private int MinimumPlayerAge;
//constructor
public Game(boolean indoors,boolean outdoors,ArrayList<Entertainment> entertainment, int minimumPlayerAge) {
	super(indoors, outdoors,entertainment);
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
