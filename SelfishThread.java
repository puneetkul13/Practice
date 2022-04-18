package MultiThreadingGCornell;

import java.util.Date;

public class SelfishThread extends Thread {
	public String name;
	public SelfishThread(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
//			long t = new Date().getTime();
//			while(new  Date().getTime()<t+0.01);
		}
	}

}
