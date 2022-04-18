package Inheritance;

public class Circle extends Shape{
	private double radius;
	public Circle() {
		super();
		this.radius = 1;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius , String color, boolean isFilled) {
		super(color , isFilled);
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	public double getPerimeter() {
		double perimeter = Math.PI * 2 *radius;
		return perimeter;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]" + "Shape [color = "+this.getColor()+" filled = "+this.isFilled()+" ]";
	}
	

}
