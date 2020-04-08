package interfacePackage;

public class fourthObject extends building{
	
	private boolean enter;
	private boolean enter2;
	private boolean enter3;
	
	//this is the only object that needs a constructor because the other three
	//I had used to show potential problems with inherited static fields
	public fourthObject(boolean enter, boolean enter2, boolean enter3) {//constructor
		super();
		this.enter = enter;
		this.enter2 = enter2;
		this.enter3 = enter3;
	}

	
	public void interfaceOneMethod(){//calls its parent class but also states what object the method is called by
		if(enter==true) {
		System.out.println("-------------------------------");
		super.interfaceOneMethod();//calls the builder class for this method.
		System.out.println("from Object Class four");
		System.out.println("-------------------------------");
		}
		if(enter==false){
			System.out.println("fourth object class will not print the abstract method from the third interface class.");
		}
	}
	public void interfaceTwoMethod(){//calls its parent class but also states what object the method is called by
		if(enter2==true) {
		System.out.println("-------------------------------");
		super.interfaceTwoMethod();//calls the builder class for this method.
		System.out.println("from Object Class four");
		System.out.println("-------------------------------");
		}
		if(enter2==false) {
			System.out.println("fourth object class will not print the abstract method from the third interface class.");
		}
		
	}
	public void interfaceThreeMethod(){//calls its parent class but also states what object the method is called by
		if(enter3==true) {
		System.out.println("-------------------------------");
		super.interfaceThreeMethod();//calls the builder class for this method.
		System.out.println("from Object Class four");
		System.out.println("-------------------------------");
		}
		if(enter3==false) {
			System.out.println("fourth object class will not print the abstract method from the third interface class.");
		}
	}
//getters
	public boolean isEnter() {
		return enter;
	}
	public boolean isEnter2() {
		return enter2;
	}
	public boolean isEnter3() {
		return enter3;
	}
//setters
	public void setEnter2(boolean enter2) {
		this.enter2 = enter2;
	}
	public void setEnter(boolean enter) {
		this.enter = enter;
	}
	public void setEnter3(boolean enter3) {
		this.enter3 = enter3;
	}
}
