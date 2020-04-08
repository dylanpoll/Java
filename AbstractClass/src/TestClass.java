
public class TestClass {
	public static void main(String[] args) {
		Gambler Chriss = new Gambler();
		System.out.print("Chriss ");
		Chriss.gamble();
	}
}
/*
--personal notes
 * interface class == a class that interfaces with an abstract class, 
 * 		neat video explained it as.... 
 * Mario v donkey kong game
 * characters = abstract class
 * name/location int x int y/face direction
 * interface classes
 * killable
 * take a hit
 * die
 * respawn
 * movable
 * turn left/right move forward
 * audible 
 * speak
 * so mario(character) interfaces with all three
 * peach interfaces with only audible.
 * Student will demonstrate the ability to create and use abstract classes and interfaces 
 * Student will understand the purpose of an interface as opposed to an abstract class
 * --------------------
 * if your thinking of a collection of common properties == abstract class
 * --------------------
 * common methods to be used by those in different ways for different abstract classes == interface 
1)You are to make up your own theme for this assignment.

2)You are to make up your own classes for this assignment.

3)You are to create an Abstract Class with Abstract Methods, 
a class that uses the abstract methods and a test class

4)You are to create all necessary setters, getters, constructors and methods.

5)You are to create a reasonable test case

6)You are to create UMLs for all non-test case classes.
--
will learn
creating abstract classes
abstract methods
abstract classes cannot be instantiated 
no object of type abstract class
understand that the point of an abstract class is to enforce rules on -all- child classes
*/