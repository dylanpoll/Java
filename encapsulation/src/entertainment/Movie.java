package entertainment;
import java.util.ArrayList;
class Movie extends Entertainment{
	private String Title;
	private int Year;
	private char StarRating;
	private static ArrayList<Movie> movies;//used for file print
//constructor
protected Movie(boolean indoors,boolean outdoors,String title, int year, char starRating) {
		super(indoors,outdoors);
		Title = title;
		Year = year;
		StarRating = starRating;
		setArrayList();//records movie into arraylist
	}
//setters
protected void setArrayList(){
	Movie addMovie = new Movie(this.isIndoors(),this.isOutdoors(),this.Title,this.Year,this.StarRating);
	Movie.movies.add(addMovie);
}
protected void setTitle(String title) {
		Title = title;
	}
protected void setStarRating(char starRating) {
		StarRating = starRating;
	}
protected void setYear(int year) {
		Year = year;
	}
//getters
protected int getYear() {
		return Year;
	}
protected char getStarRating() {
		return StarRating;
	}
protected String getTitle() {
		return Title;
	}
//to-string
@Override
public String toString() {
	return super.toString()+"Movie [Title=" + Title + ", Year=" + Year + ", StarRating=" + StarRating + "]";
}
}
