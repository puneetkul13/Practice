package MultiThreadingGCornell;

public class SharedResource1 extends Thread {
	private SharedResource s;
	public SharedResource1(SharedResource s) {
		this.s = s;
	}
	public void run() {
		s.displayer();
		
	}
	

}
