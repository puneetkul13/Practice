package Inheritance;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}
	public String toString() {
		return "Mammal:Mammal[Animal[name= "+this.name+"]]";
	}

}
