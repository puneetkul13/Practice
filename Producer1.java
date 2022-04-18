package MultiThreadingGCornell;

import java.util.List;

public class Producer1 implements Runnable {
	public List<Integer> questions =null;
	int i=1;
	public Producer1(List<Integer> questions) {
		this.questions = questions;
	}
	public  void adder(int qn) throws InterruptedException {
		synchronized(questions) {
			while(questions.size()==5) {
				System.out.println("Question Limit Reached");
				wait();
				
				
			}
		}
		synchronized(questions) {
			
			questions.add(qn);
			
			System.out.println("Question Raised: "+ qn);
			Thread.sleep(200);
			notify();
			
		}
		
		
	}
	@Override
	public void run() {
		while(true) {
			i=i+1;
			try {
				adder(i);
			} catch (InterruptedException e) {
				
			}
		}
	}
	

}
