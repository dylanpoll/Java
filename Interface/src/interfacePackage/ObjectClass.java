package interfacePackage;

public class ObjectClass extends building{

	//this shows how they can be changed around and shows polymorph method use.
	public void interfaceOneMethod(){//calls its parent class but also states what object the method is called by
		if(super.isPass()==true) {
		System.out.println("-------------------------------");
		super.interfaceOneMethod();//calls the builder class for this method.
		System.out.println("from Object Class one");
		System.out.println("-------------------------------");
		}
		if(super.isPass()==false) {
			System.out.println("first object class will not print the abstract method from the first interface class.");
			}
	}
	public void interfaceTwoMethod(){//calls its parent class but also states what object the method is called by
		if(super.isPass2()==true) {
		System.out.println("-------------------------------");
		super.interfaceTwoMethod();//calls the builder class for this method.
		System.out.println("from Object Class one");
		System.out.println("-------------------------------");
		}
		if(super.isPass2()==false) {
			System.out.println("first object class will not print the abstract method from the second interface class.");
			}
	}
	public void interfaceThreeMethod(){//calls its parent class but also states what object the method is called by
		if(super.isPass3()==true) {
		System.out.println("-------------------------------");
		super.interfaceThreeMethod();//calls the builder class for this method.
		System.out.println("from Object Class one");
		System.out.println("-------------------------------");
		}
		if(super.isPass3()==false) {
			System.out.println("first object class will not print the abstract method from the third interface class.");
			}
	}
}


