//abstract methods are the most important part about abstract classes
//abstract methods are methods that are not implemented yet
abstract class Player{
	//abstract classes exist to be extended, because they cannot be instantiated 
	String gamble;
	
	public void gamble(){
		System.out.println("has gambled away all his life savings..");
		}
	
	abstract public void gambling();//it is not implemented that is why in another location we 
									// give the information for the method.
									// TLDR: this is used to define a method that WILL be used by the class
									// but may be different for different objects in the class. 
	
}//end of abstract class
/*
 * Be careful not to confuse the concept of an “Abstract Method” 
 * which is a method in an abstract class that has no body, and a 
 * “static” method. When a method is static, it doesn’t require the 
 * class to be instantiated in order to put it to use.
 */
