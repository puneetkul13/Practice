package MultiThreadingGCornell;

import java.util.List;

public class Producer2 extends Thread {
	List<Integer> questions = null;
	int qn = 0;
	public Producer2(List<Integer> questions) {
		this.questions = questions;
	}
	public void adder(int qn) throws InterruptedException {
		synchronized(questions) {
			while(questions.size()==5) {
				System.out.println("Question Limit reached...wait");
				questions.wait();
			}
		}
		synchronized(questions) {
			questions.add(qn);
			System.out.println("Question added: "+qn);
			Thread.sleep(500);
			questions.notify();
		}
		
	}
	public void run() {
		while(true) {
			qn+=1;
			try {
				adder(qn);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
