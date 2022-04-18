package Inheritance;

public class LineSub extends MyPoint {
	private MyPoint end;
	public LineSub(int beginX , int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end.setX(endX);
		this.end.setY(endY);
	}
	public LineSub(MyPoint begin, MyPoint end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	@Override
	public String toString() {
		return "LineSub [end=["+this.end.getX()+","+this.end.getY()+"] begin=["+super.getX()+","+super.getY()+"]]";
	}
	public MyPoint getBegin() {
		int beginX = super.getX();
		int beginY = super.getY();
		MyPoint begin =  new MyPoint(beginX, beginY);
		return begin;
	}
	public MyPoint getEnd() {
		return this.end;
	}
	public void setBegin(MyPoint begin) {
		int beginX = begin.getX();
		int beginY = begin.getY();
		super.setX(beginX);
		super.setY(beginY);
		
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	public int getBeginX() {
		return super.getX();
	}
	public int getBeginY() {
		return super.getY();
	}
	public int getEndX() {
		return this.end.getX();
	}
	public int getEndY() {
		return this.end.getY();
	}
	
	public void setBeginX(int beginX) {
		super.setX(beginX);
	}
	public void setBeginY(int beginY) {
		super.setY(beginY);
	}
	public void setEndX(int endX) {
		this.end.setX(endX);
	}
	public void setEndY(int endY) {
		this.end.setY(endY);
	}
	public void setBeginXY(int beginX , int beginY) {
		super.setX(beginX);
		super.setY(beginY);
	}
	public void setEndXY(int endX, int endY) {
		this.end.setX(endX);
		this.end.setY(endY);
	}
	public double getLength() {
		int x1 = super.getX();
		int y1 = super.getY();
		int x2 = this.end.getX();
		int y2 = this.end.getY();
		double length = Math.pow((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1), 0.5);
		return length;
	}
	public double getGradient() {
		int x1 = super.getX();
		int y1 = super.getY();
		int x2 = this.end.getX();
		int y2 = this.end.getY();
		double gradient = Math.atan2(y2-y1, x2-x1);
		return gradient;
		
	}

}
