package Inheritance;

public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle() {
		super();
		this.width = 1;
		this.length = 1;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean isFilled) {
		super(color, isFilled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	public void setWidth(double width) {
		this.width = width;
		
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		double area = this.width * this.length;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*(this.length + this.width);
		return perimeter;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]"+"Shape [color ="+this.getColor()+" filled ="+this.isFilled()+"]";
	}
	
	

}
