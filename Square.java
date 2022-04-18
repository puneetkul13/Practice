package Inheritance;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
		
	}
	public Square(double side, String color, boolean isFilled) {
		super(side, side, color, isFilled);
	}
	public double getSide() {
		return super.getWidth();
	}
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
		
	}
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
		
	}
	@Override
	public String toString() {
		return "Square[side = "+this.getSide()+"] Rectangle[ width="+super.getWidth()+", length="+super.getLength()+"] Shape[ color= "+super.getColor()+", isFilled= "+super.isFilled()+"]";
	}
	
	
	

}
