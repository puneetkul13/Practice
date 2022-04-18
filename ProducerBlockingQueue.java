package MultiThreadingGCornell;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue extends Thread {
	BlockingQueue<Integer> questionqueue;
	int question_no;
	public ProducerBlockingQueue(BlockingQueue<Integer> questionqueue) {
		this.questionqueue = questionqueue;
		
	}
	public void run() {
		synchronized(this) {
			while(true) {
				
				try {
					question_no +=1;
					questionqueue.put(question_no);
					System.out.println("New Question Added: "+question_no);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
				
				
			}
			
			
		}
		
	}

}
