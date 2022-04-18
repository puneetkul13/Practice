package Inheritance;

public class Line {
	private MyPoint begin;
	private MyPoint end;
	public Line(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}
	public Line(int beginX, int beginY, int endX, int endY) {
		MyPoint b = new MyPoint(beginX, beginY);
		MyPoint e = new MyPoint(endX , endY);
		this.begin = b;
		this.end = e;
	}
	@Override
	public String toString() {
		return "Line [begin=" + begin + ", end=" + end + "]";
	}
	public MyPoint getBegin() {
		return this.begin;
	}
	public MyPoint getEnd() {
		return this.end;
	}
	public void setBegin(MyPoint begin) {
		this.begin = begin;
		
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	public int getBeginX() {
		return this.begin.getX();
	}
	public int getBeginY() {
		return this.begin.getY();
	}
	public int getEndX() {
		return this.end.getX();
	}
	public int getEndY() {
		return this.end.getY();
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}
	public void setBeginXY(int x ,int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	public void setEndXY(int x , int y) {
		this.end.setX(x);
		this.end.setY(y);
	}
	public double getLength() {
		int x1 = this.begin.getX();
		int y1 = this.begin.getY();
		int x2 = this.end.getX();
		int y2 = this.end.getY();
		double length = Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1), 0.5);
		return length;
		
	}
	public double getGradient() {
		int x1 = this.begin.getX();
		int y1 = this.begin.getY();
		int x2 = this.end.getX();
		int y2 = this.end.getY();
		double grad= Math.atan2(y2-y1, x2-x1);
		return grad;
		
	}

}
