package MultiThreadingGCornell;

public class NuclearReactor extends Thread {
	public boolean bobeatinglunch=false;
	public boolean sameatinglunch = false;
	
	public void run() {
		while(true) {
			if((bobeatinglunch && sameatinglunch)) {
				System.out.println("Bob and Sam are eating. They are called back");
				bobeatinglunch = false;
				sameatinglunch = false;
			}
			else {
				int r = (int) (Math.random()*(10-1)+1);
				
				if(r%2==0) {
					bobeatinglunch = true;
				}else {
					sameatinglunch = true;
				}
				if(bobeatinglunch && !sameatinglunch) {
					
					System.out.println("Sam is looking at the reactor");
					
				}else if(!bobeatinglunch && sameatinglunch){
					System.out.println("BoB is looking at the reactor");
					
				}else if(!bobeatinglunch && !sameatinglunch){
					System.out.println("Both are looking at the reactor");
					
				}
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			
		}
		
		
	}
	
}
