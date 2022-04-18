package Inheritance;

public class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal: Animal[name=" + name + "]";
	}
	
	
}
