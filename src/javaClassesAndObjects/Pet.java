package javaClassesAndObjects;

public class Pet {
	// instance variables: 
	private String name;	// name(PRIVATE)
	private int age;		// age(PRIVATE) 
	private String location;	// location(PRIVATE)
	private String type;	// type(PRIVATE)
	
	// Two constructors(empty, all attributes)
	
	public Pet() {			// empty constructor		
		
	}
	
	public Pet(String name, int age, String location, String type) {	// all attributes
		
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	// Code to be able to access the following (Get Methods): 
		// name, age, type 
	// Code to be able to change (Set Methods): 
		// name, age, location  
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getType() {
		return type;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
// End of Pet class
}
