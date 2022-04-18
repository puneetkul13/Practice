package MultiThreadingGCornell;

import java.util.ArrayList;

public class WaitNotify extends Thread  {
	public ArrayList<String> questions = new ArrayList<>();
	public synchronized  void adder() {
		while(questions.size()>=5) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		while(questions.size()<5) {
			questions.add("New Question");
			System.out.println("New Question Added: " + questions.size());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
			notify();
			
		}
	}
	public synchronized void displayer() {
		while(questions.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		while(questions.size()>0) {
			System.out.println("Question Answered" + questions.remove(0));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			notify();
			
		}
	}
	public void run() {
		while(true) {
			adder();
			displayer();
			
		}
		
	}
	

}
