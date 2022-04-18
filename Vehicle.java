package Collections;

public class Vehicle {
	private String make;
	private String name;
	private String color;
	private double price;
	
	public Vehicle(String make, String name, String color, double price) {
		super();
		this.make = make;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
	

}
