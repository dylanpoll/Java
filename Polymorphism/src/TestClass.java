/* Name: Dylan M. Poll
 * date: 03/17/2020
 * Assignment: Polymorphism
 * class: Java 2800c
 * uses a abstract class, class overriding and to-string overloading to show polymorphism.
 */
public class TestClass {

public static void main(String[] args){
	// all the objects created below have a abstract parent class of athlete, and athlese has a abstract parent class person.
//first four slots for person + athlete are :String name, int age, String team, String position-sport
	BaseballPlayer Hank = new BaseballPlayer("Hank Williams", 33, "Mets", "Pitcher", " left handed");
	System.out.print(Hank.toString());
	Hank.doThis();
	System.out.println("-------------------------");
	
    FootballPlayer Terry = new FootballPlayer("Terry Cruz", 28, "Gators", "Quarter-back", "Offense");
    System.out.print(Terry.toString());
    Terry.doThis();
	System.out.println("-------------------------");
    
    HockeyPlayer  Mario =new HockeyPlayer("Mario Luigi Mario", 24, "Canada-TM", "Defence", "AuthenticBrandName.TM"); 
    System.out.print( Mario.toString());
    Mario.doThis();
	System.out.println("-------------------------");
    
    GolfPlayer Tiger = new GolfPlayer("Tiger Woods", 44, "Dirty Golf Team of America", "no-position", "Golf Club USA");
    System.out.print(Tiger.toString());
    Tiger.doThis();
	System.out.println("-------------------------");
    
    BaseballPlayer Barry = new BaseballPlayer("Barry Allen", 44, "Mets", "First-Base", "right handed");
    System.out.print(Barry.toString());
    Barry.doThis();
	System.out.println("-------------------------");
    
    FootballPlayer Payton = new FootballPlayer("Payton Manning", 32, "Gators", "line backer", "Special Teams"); 
    System.out.print(Payton.toString());
    Payton.doThis();
	System.out.println("-------------------------");
    
    HockeyPlayer Wayne = new HockeyPlayer("Wayne Bruce", 44, "Gotham City Jokers", "Defence", "Wayne Enterprises");
    System.out.print(Wayne.toString());
    Wayne.doThis();
	System.out.println("-------------------------");
    
    GolfPlayer Phil = new GolfPlayer("Phil Doctor", 55, "Golfers for youth counceling", "no-position", "Miller Lite");
    System.out.print(Phil.toString());
    Phil.doThis();
	System.out.println("-------------------------");
	
}//end main

}//end class
