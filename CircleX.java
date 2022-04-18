package AbstractAndInterfaces;

public class CircleX implements GeometricObject {
	protected double radius;
	public CircleX(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		double area = Math.PI * this.radius * this.radius;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = Math.PI *2*this.radius;
		return perimeter;
	}
	@Override
	public String toString() {
		return "CircleX [radius=" + radius + "]";
	}
	

}
