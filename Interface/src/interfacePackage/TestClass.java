/* Name: Dylan M. Poll
 * date: 03/14/2020
 * Assignment: Interface
 * class: Java 2800c
 * uses three interface classes, one abstract method class, four object classes, and a TestClass to show
 * the relationship between them all. does not need user inputs.
 */
package interfacePackage;
public class TestClass{
	// object class extends abstract build class.
	// abstract build class implements interfaces 1+2+3
	// abstract build class defines abstract methods from those interfaces
	// test class calls object class
	// ObjectClass calls inherited methods in abstract building class
	
public static void main(String[] args) {//this is a test for my setup
		System.out.println("creating three objects");
		System.out.println();
		ObjectClass show = new ObjectClass();
		SecondObjectClass show2 = new SecondObjectClass();
		ThirdObjectClass show3 = new ThirdObjectClass();
		show.setPass(true);
		show.setPass2(true);
		show.setPass3(true);

		System.out.println("I will print all the implemented methods from three different objects");
		System.out.println();
		show.interfaceOneMethod();//method from interfaceOne
		show2.interfaceTwoMethod();//method from interfaceTwo
		show3.interfaceThreeMethod();//method from interfaceThree
	System.out.println("next I will print all the implemented methods from the interfaces from the class -ObjectOne-.");
	System.out.println();
		//or all three methods from one 
		show.interfaceOneMethod();
		show.interfaceTwoMethod();
		show.interfaceThreeMethod();
		System.out.println();
		//this works because all three object classes inherent from building.
	System.out.println("this works because all three object classes inherent from building. So they can all print the methods.");
	System.out.println();
	System.out.println("now I will print methods from the implimented interface classes, but i will change a field varieble in -building- to false");
	System.out.println("from the individual object classes. I will make the boolean pass = false in objectClass and pass3 = false in SecondObjectClass");
	System.out.println(" and pass2 false in ThirdObjectClass. this will prevent the call to super from the object class preventing the statements from being printed.");
	System.out.println();
	
	//set pass values
	show.setPass(false);//this shows inherited logic use
	show2.setPass3(false);
	show3.setPass2(false);
	
	//prints object one
	show.interfaceOneMethod();
	show.interfaceTwoMethod();
	show.interfaceThreeMethod();
	System.out.println();
	
	//prints object 2
	show2.interfaceOneMethod();
	show2.interfaceTwoMethod();
	show2.interfaceThreeMethod();
	System.out.println();
	
	//prints object 3
	show3.interfaceOneMethod();
	show3.interfaceTwoMethod();
	show3.interfaceThreeMethod();
	System.out.println();
	System.out.println("notice how none of them printed? that is because they all share the same parent class, and the parent class");
	System.out.println("has the fields within it declared as private and STATIC, this means only one iteration of that variable is present.");
	System.out.println("meaning that a change from any child class to them, reflects in all others using that varieble as there are not");
	System.out.println("multiple instances of it being created for the child classes.");
	System.out.println();
	System.out.println("I will now make a fourth object, this has its own variables: enter, enter2,enter3 they are booleans and will be set as");
	System.out.println("enter =true, enter2 = false, enter3 =true");
	System.out.println(" using the same design, but the enter variebles as deciding factors on if we print the abstract methods.");
	System.out.println();
	
	fourthObject show4 = new fourthObject(true, false, true);//creates fourth object to show local logic use applies to inherited methods
	
	show4.interfaceOneMethod();
	show4.interfaceTwoMethod();
	show4.interfaceThreeMethod();
	
	System.out.println();
	System.out.println("this code shows how to interfacing works, and uses inheritence and abstract classes to do that.");
	
}
}//end of TestClass