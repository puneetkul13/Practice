package Inheritance;

public class Dog extends Mammal {
	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog dog) {
		System.out.println("Woooof");
	}
	@Override
	public String toString() {
		return "Dog[Mammal[Animal:Animal[name = "+this.name+"]]]";
	}
	

}
