package MultiThreadingGCornell;

public class SharedResource {
	private int x=5;
	public void displayer() {
		System.out.println(x+"--Displayer");
		
	}
	public void modifier() {
		this.x = 7;
		System.out.println(x+"--Modifier");
	}
	

}
