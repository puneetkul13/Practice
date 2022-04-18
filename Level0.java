package MultiThreadingGCornell;

public class Level0 extends Thread {
	public String name;
	public Level0(String name, ThreadGroup gfg) {
		super(gfg,name);
		this.name = name;
		start();
	}
	public void run() {
		for(int i =0; i<100000000; i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
			}
		}
	}

}
