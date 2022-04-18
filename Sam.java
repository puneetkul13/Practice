package MultiThreadingGCornell;

public class Sam extends Thread {
	NuclearReactor n;
	public Sam(NuclearReactor n) {
		this.n = n;
	}
	public void run() {
		while(true) {
			synchronized(this) {
				if(n.bobeatinglunch == true) {
					System.out.println("BoB is eating lunch. I can't go out for the lunch");
					if(n.NuclearReactorStatus()==false) {
						n.sameatinglunch = false;
						n.bobeatinglunch = false;
					}
					try {
						wait();
					} catch (InterruptedException e) {
						
					}
				}
				if(n.bobeatinglunch==false) {
					System.out.println("Bob is not eating, i can go out");
					n.sameatinglunch = true;
					notify();
				}
				
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
				n.sameatinglunch = false;
				n.bobeatinglunch = true;
				
			}
		}
		
	}

}
