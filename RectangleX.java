package AbstractAndInterfaces;

public class RectangleX implements GeometricObject {
	private double width;
	private double length;
	public RectangleX(double width, double length) {
		this.width = width;
		this.length = length;
	}
	@Override
	public double getPerimeter() {
		double perimeter = 2*(this.width + this.length);
		return perimeter;
	}

	@Override
	public double getArea() {
		double area = this.width * this.length;
		return area;
	}
	@Override
	public String toString() {
		return "RectangleX [width=" + width + ", length=" + length + "]";
	}
	
	

}
