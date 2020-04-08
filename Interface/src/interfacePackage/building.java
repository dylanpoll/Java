package interfacePackage;

abstract public class building implements InterFaceOne,InterFaceTwo,InterFaceThree {
	private static boolean pass;// pass/pass2/pass3 are used for showing inheritance rules
	private static boolean pass2;
	private static boolean pass3;
	@Override
	public void interfaceOneMethod(){//the method from interface one
		System.out.println("printing a line from the abstract class -building class- that IMPLEMENTS -interfaceOne-'s abstract method interfaceOneMethod()");
	}
	@Override
	public void interfaceTwoMethod(){//the method from interface two
		System.out.println("printing a line from the abstract class -building class- that IMPLEMENTS -interfaceTwo-'s abstract method interfaceTwoMethod()");
	}
	@Override
	public void interfaceThreeMethod(){//the method from interface three
		System.out.println("printing a line from the abstract class -building class- that IMPLEMENTS -interfaceThree-'s abstract method interfaceThreeMethod()");
	}
	public static boolean isPass() {
		return pass;
	}
	public void setPass(boolean pass) {
		building.pass = pass;
	}
	public boolean isPass2() {
		return pass2;
	}
	public void setPass2(boolean pass2) {
		building.pass2 = pass2;
	}
	public boolean isPass3() {
		return pass3;
	}
	public void setPass3(boolean pass3) {
		building.pass3 = pass3;
	}
}
