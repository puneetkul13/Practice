package MultiThreadingGCornell;

import java.util.List;

public class Consumer2 extends Thread {
	List<Integer> questions = null;
	public Consumer2(List<Integer> questions) {
		this.questions = questions;
	}
	public void displayer() throws InterruptedException {
		synchronized(questions) {
			while(questions.size()==0) {
				System.out.println("No question to answer");
				questions.wait();
			}
		}
		synchronized(questions) {
			System.out.println("Question Answered: "+ questions.remove(0)); 
			Thread.sleep(500);
			questions.notify();
		}
	}
	public void run() {
		while(true) {
			try {
				displayer();
			} catch (InterruptedException e) {
			
			}
		}
	}

}

