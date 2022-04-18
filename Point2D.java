package Inheritance;

public class Point2D {
	private float x;
	private float y;
	public Point2D() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	public Point2D(float x , float y) {
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}
	public float[] getXY() {
		float[] XY = new float[2];
		XY[0] = this.x;
		XY[1] = this.y;
		return XY;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y =y;
	}
	public void setXY(float[] XY) {
		this.x = XY[0];
		this.y = XY[1];
		
		
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
