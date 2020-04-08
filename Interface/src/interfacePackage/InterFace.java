package interfacePackage;
interface InterFaceOne {
	void interfaceOneMethod();//all methods in a interface are abstract.
}
interface InterFaceTwo{
	void interfaceTwoMethod();
}
interface InterFaceThree{
	void interfaceThreeMethod();
}
/*
* an interface assumes all called methods will be abstract
* so you don't have to mark abstract
* if you try it will error out.
*
* from -https://beginnersbook.com/2013/05/java-interface/-
* 
*  they are used for full abstraction.
*  Since methods in interfaces do not have body, they have to be implemented by the class before you can access them.
*  The class that implements interface must implement all the methods of that interface. 
*  Also, java programming language does not allow you to extend more than one class, 
*  However you can implement more than one interfaces in your class.
* 
*  an interface can not implement another interface. It has to extend the other interface. 
* 
*  A class cannot implement two interfaces that have methods with same name but different return type.
*  
*  An empty interface is known as tag or marker interface. For example:
*  Serializable, EventListener, Remote(java.rmi.Remote) are tag interfaces. 
*  These interfaces do not have any field and methods in it.
*  
*  An interface which is declared inside another interface or class is called nested interface. 
*  They are also known as inner interface. For example Entry interface 
*  in collections framework is declared inside Map interface, that’s why we don’ 
*  use it directly, rather we use it like this: Map.Entry.
*  
1) We can’t instantiate an interface in java. That means we cannot create the object of an interface
2) Interface provides full abstraction as none of its methods have body. On the other hand abstract 
	class provides partial abstraction as it can have abstract and concrete(methods with body) methods both.
3) implements keyword is used by classes to implement an interface.
4) While providing implementation in class of any method of an interface, it needs to be mentioned as public.
5) Class that implements any interface must implement all the methods of that interface, else the class should be declared abstract.
6) Interface cannot be declared as private, protected or transient.
7) All the interface methods are by default abstract and public.
8) Variables declared in interface are public, static and final by default.
9) Interface variables must be initialized at the time of declaration otherwise compiler will throw an error.
10) Inside any implementation class, you cannot change the variables declared in interface because by default, 
	they are public, static and final. Here we are implementing the interface “Try” which has a variable x. When we
 	tried to set the value for variable x we got compilation error as the variable x is public static final by default
  	and final variables can not be re-initialized.
11) An interface can extend any interface but cannot implement it. Class implements interface and interface extends interface.
12) A class can implement any number of interfaces.
13) If there are two or more same methods in two interfaces and a class implements both interfaces, 
	implementation of the method once is enough.
15) Variable names conflicts can be resolved by interface name.
Without bothering about the implementation part, we can achieve the security of implementation
In java, multiple inheritance is not allowed, however you can use interface to make use of it as you can implement more than one interface.
*/