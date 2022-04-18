package AbstractAndInterfaces;

public class BigDog extends Dog {
	public BigDog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Wooow");
	}
	public void greets(Dog AnotherDog) {
		System.out.println("Wooooow");
	}
	public void greets(BigDog AnotherBigDog) {
		System.out.println("Woooooooooow");
	}
}
