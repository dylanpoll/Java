package entertainment;
public class Entertainment {
	private boolean indoors;
	private boolean outdoors;
//constructor
protected Entertainment(boolean indoors, boolean outdoors) {
		this.indoors = indoors;
		this.outdoors = outdoors;
	}
//getters---
protected boolean isIndoors() {
		return indoors;
	}
protected boolean isOutdoors() {
		return outdoors;
	}	
//setters---
protected void setIndoors(boolean indoors) {
		this.indoors = indoors;
	}
protected void setOutdoors(boolean outdoors) {
		this.outdoors = outdoors;
	}
//to-string
@Override
public String toString() {
		return "Entertainment [indoors=" + indoors + ", outdoors=" + outdoors + "]";
	}
}
