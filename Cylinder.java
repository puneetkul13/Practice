package Inheritance;
import OOPS_practice.*;
public class Cylinder{
	private Circle base;
	private double height;
	public Cylinder() {
		this.height=1;
		Circle c = new Circle();
		this.base = c;
	}
	public Cylinder(double radius, double height) {
		this.height = height;
		this.base = new Circle(radius);
		
	}
	public Cylinder(double radius, double height, String color) {
		this.base = new Circle(radius, color,true);
		this.height = height;
		
	}
	
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		double radius = this.base.getRadius();
		double height = this.height;
		double volume = Math.PI*radius*radius*height;
		return volume;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ",radius="+base.getRadius()+", color = "+base.getColor()+ "]" ;
	}
	

}
