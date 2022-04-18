package MultiThreadingGCornell;

public class SharedResource2 extends Thread {
	private SharedResource s;
	public SharedResource2(SharedResource s) {
		this.s = s;
	}
	public void run() {
		s.modifier();
	}

}
