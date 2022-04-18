package GenericsPractice;

public class GenericContainerBoundedType<T extends Number> {
	private T x;
	public GenericContainerBoundedType(T x) {
		this.x = x;
	}
	public T getX() {
		return this.x;
	}
	public void setX(T x) {
		this.x = x;
	}

}

