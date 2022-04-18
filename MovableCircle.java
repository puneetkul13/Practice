package AbstractAndInterfaces;

public class MovableCircle extends MovablePoint implements Movable  {
	protected int radius;
	protected MovablePoint center;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super(x, y, xSpeed, ySpeed);
		this.radius = radius;
		center = new MovablePoint(x,y,xSpeed,ySpeed);
	}
	@Override
	public void moveUp() {
		super.moveUp();
		this.center.y = this.center.y -this.center.ySpeed;
		
	}
	@Override
	public void moveDown() {
		super.moveDown();
		this.center.y = this.center.y + this.center.ySpeed;
	}
	@Override
	public void moveLeft() {
		super.moveLeft();
		this.center.x = this.center.x - this.center.xSpeed;
	}
	@Override
	public void moveRight() {
		super.moveRight();
		this.center.x = this.center.x + this.center.xSpeed;
	}
	@Override
	public String toString() {
		return "Center[("+super.x+","+super.y+") speed=("+super.xSpeed+","+super.ySpeed+")]";
		
	}

}
