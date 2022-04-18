package MultiThreadingGCornell;

import java.util.ArrayList;
import java.util.List;

public class Consumer1 implements Runnable {
	List<Integer> questions = null;
	public Consumer1(List<Integer> questions) {
		this.questions = questions;
	}
	public void displayer() throws InterruptedException {
		synchronized(questions) {
			while(questions.size()==0) {
				System.out.println("No Questions to Answer");
				questions.wait();
		}
		synchronized(questions) {
			System.out.println("Question Answered: "+questions.remove(0));
			Thread.sleep(500);
			questions.notify();
			
		}
		}}
			
		
			
		
	@Override
	public void run() {
		while(true) {
			try {
				displayer();
			} catch (InterruptedException e) {
				
			}
		}
	}

}
