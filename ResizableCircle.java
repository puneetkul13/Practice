package AbstractAndInterfaces;

public class ResizableCircle extends CircleX implements Resizable {
	protected double radius;
	public ResizableCircle(double radius) {
		super(radius);
		this.radius = radius;
	}
	@Override
	public void resize(int percent) {
		this.radius = (this.radius/100)*percent;
		super.radius = (super.radius/100)*percent;
		
	}
	@Override
	public String toString() {
		String s="ResizableCircle[Circle[Radius="+super.radius+"]]";
		return s;
	}
	
	
	
	

}
