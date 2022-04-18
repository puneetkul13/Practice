package MultiThreadingGCornell;

import java.util.ArrayList;
import java.util.List;

public class Consumer4 extends Thread {
	ArrayList<Integer> questions = null;
	public Consumer4(ArrayList<Integer> questions) {
		this.questions = questions;
	}
	public void displayer() {
		synchronized(questions) {
			while(questions.size()==0) {
				System.out.println("No question to answer");
				try {
					questions.wait();
				} catch (InterruptedException e) {
					
				}
			}
			
		}
		synchronized(questions) {
			System.out.println("Question Answered: "+questions.remove(0));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
			questions.notify();
		}
		
	}
	@Override
	public void run() {
		while(true) {
			displayer();
		}
	}

}
