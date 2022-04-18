package Inheritance;

public class Point3D extends Point2D {
	private float z;
	public Point3D() {
		super();
		this.z =z;
	}
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
		
		
	}
	public float getZ() {
		return this.z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public float[] getXYZ() {
		float[] XYZ = new float[3];
		XYZ[0] = super.getX();
		XYZ[1] = super.getY();
		XYZ[2] = this.z;
		return XYZ;
	}
	public void setXYZ(float x, float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point3D [z=" + z + "x= "+super.getX()+ "y= "+super.getY()+ "]";
	}
	@Override
	public void setX(float x) {
		super.setX(x);
		System.out.println("Overriding the parent's method");
	}
	

}
