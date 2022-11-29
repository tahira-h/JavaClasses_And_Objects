package javaClassesAndObjects;

public class Car {
	private String name;
	private int age;
	private String location;
	
	public Car() {
		
	}
	
	public Car(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Car(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge() {
		this.age = age;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean ecoFriendly() {
		return true;
	}
	
	public String zoomZoomZoom() {
		return "Zoom! Zoom! Zoom!";
	}
	
	public String hybridVehicle(String list) {	// this line creates a variable called list
		return list;
	}

// End of Car class
}
