abstract public class Person {
// A person has a name, and age
	private String name;
	private int age;
//to-string
@Override
public String toString(){
return "Name: " + name +"\n"+"Age: "  + age  +"\n";
}
//constructor 
public Person(String name, int age){
	//for hard coded people
	this.name = name;
	this.age = age;
}
//--getters
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
//--setters
public void setAge(int age) {
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}
}
