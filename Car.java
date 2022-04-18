package Lesson3;

public class Car {
	String make, model, color;
	int price;
	public Car(String make, String model, String color, int price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	

}
