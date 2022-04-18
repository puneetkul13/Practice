package MultiThreadingGCornell;

import java.util.ArrayList;
import java.util.List;

public class Producer4 extends Thread {
	public ArrayList<Integer> questions =null;
	int qn=1;
	public Producer4(ArrayList<Integer> questions) {
		this.questions = questions;
	}
	public void adder(int q) throws InterruptedException {
		synchronized(questions) {
			while(questions.size()==5) {
				System.out.println("Questions Limit Reached. wait...");
				try {
					questions.wait();
				} catch (InterruptedException e) {
					
				}
			}
		}
		synchronized(questions) {
			questions.add(q);
			System.out.println("New Question added: "+q);
			Thread.sleep(500);
			questions.notify();
		}
	}
	@Override
	public void run() {
		while(true) {
			try {
				adder(qn);
			} catch (InterruptedException e) {
				
			}
			qn++;
		}
	}
	

}
