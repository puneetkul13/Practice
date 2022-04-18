package MultiThreadingGCornell;

public class BoB extends Thread {
	NuclearReactor n ;
	public BoB(NuclearReactor n) {
		this.n = n;
	}
	public void run() {
		while(true) {
			synchronized(this) {
				if(n.sameatinglunch==true) {
					System.out.println("Sam is eating. I can't go out for lunch");
					if(n.NuclearReactorStatus()==false) {
						n.sameatinglunch = false;
						n.bobeatinglunch = false;
					}
					try {
						wait();
					} catch (InterruptedException e) {
						
					}
				}
				if(n.sameatinglunch==false) {
					System.out.println("Sam is looking at reactor, I can go for a lunch");
					n.bobeatinglunch = true;
					notify();
				}
//				
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
				n.bobeatinglunch = false;
				n.sameatinglunch = true;
			}
			
			
			
			
			
			
		}
		
		
	}
	

}
