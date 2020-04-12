package entertainment;

import java.util.ArrayList;

public class Entertainment {
	private boolean indoors;
	private boolean outdoors;
	protected static ArrayList<Entertainment> entertainment;//stores all entertainment
//constructor
protected Entertainment(boolean indoors, boolean outdoors,ArrayList<Entertainment> entertainment) {
		this.indoors = indoors;
		this.outdoors = outdoors;
		Entertainment.entertainment = entertainment;
	}
//getters---
public static ArrayList<Entertainment> getEntertainment() {
	return entertainment;
}
public boolean isIndoors() {
		return indoors;
	}
public boolean isOutdoors() {
		return outdoors;
	}	
//setters---
public void setIndoors(boolean indoors) {
		this.indoors = indoors;
	}
public void setOutdoors(boolean outdoors) {
		this.outdoors = outdoors;
	}
//to-string
@Override
public String toString() {
		return "Entertainment [indoors=" + indoors + ", outdoors=" + outdoors + "]";
	}
}
