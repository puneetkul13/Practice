package GenericsPractice;

public class GenericContainer<T,S> {
	private T firstPosition;
	private S secondPosition;
	public GenericContainer(T firstPosition, S secondPosition) {
		this.firstPosition = firstPosition;
		this.secondPosition = secondPosition;
	}
	public T getFirstPosition() {
		return this.firstPosition;
	}
	public void setFirstPosition(T firstPosition) {
		this.firstPosition = firstPosition;
	}
	public S getSecondPosition() {
		return this.secondPosition;
		
	}
	public void setSecondPosition(S secondPosition) {
		this.secondPosition = secondPosition;
	}

}
