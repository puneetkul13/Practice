package Inheritance;

public class MovablePoint extends Point {
	private float xs;
	private float ys;
	public MovablePoint() {
		super();
		this.xs = 0.0f;
		this.ys = 0.0f;
	}
	public MovablePoint(float xs , float ys) {
		super();
		this.xs = xs;
		this.ys = ys;
	}
	public MovablePoint(float x, float y , float xs, float ys) {
		super(x,y);
		this.xs = xs;
		this.ys=ys;
	}
	public float getXSpeed() {
		return this.xs;
	}
	public float getYSpeed() {
		return this.ys;
	}
	public void setXSpeed(float xs) {
		this.xs = xs;
	}
	public void setYSpeed(float ys) {
		this.ys = ys;
	}
	public void setSpeed(float xs , float ys) {
		this.xs = xs;
		this.ys = ys;
	}
	public float[] getSpeed() {
		float[] speed = new float[2];
		speed[0] = xs;
		speed[1] = ys;
		return speed;
	}
	@Override
	public String toString() {
		return "MovablePoint [xs=" + xs + ", ys=" + ys + "]" + "Point[x = "+this.getX()+" y = "+this.getY()+"]";
	}
	public MovablePoint move() {
		float x = this.getX();
		float newX = x + this.xs;
		this.setX(newX);
		float y = this.getY();
		float newY = y + this.ys;
		this.setY(newY);
		return this;
	}
	
	

}
