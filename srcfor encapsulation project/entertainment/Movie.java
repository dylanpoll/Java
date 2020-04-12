package entertainment;
import java.util.ArrayList;
public class Movie extends Entertainment{
	private String Title;
	private int Year;
	private int StarRating;
	private String description;
//constructor
public Movie(boolean indoors,boolean outdoors,ArrayList<Entertainment> entertainment,String title, int year,
		int starRating, String description) {
		super(indoors,outdoors, entertainment);
		Title = title;
		Year = year;
		StarRating = starRating;
		this.description = description;
		
	}
//setters
public void setTitle(String title) {
		Title = title;
	}
public void setStarRating(int starRating) {
		StarRating = starRating;
	}
public void setYear(int year) {
		Year = year;
	}

public void setDescription(String description) {
	this.description = description;
}
//getters
public int getYear() {
		return Year;
	}
public int getStarRating() {
		return StarRating;
	}
public String getTitle() {
		return Title;
	}
public String getDescription() {
	return description;
}
//to-string
@Override
public String toString() {
	return super.toString()+"Movie [Title=" + Title + ", Year=" + Year + ", StarRating=" + StarRating + "]";
}
public static void userSetArrayList(Movie newEntertainment){
	Entertainment.entertainment.add(newEntertainment);
}
}

