package MultiThreadingGCornell;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue extends Thread {
	BlockingQueue<Integer> questionqueue;
	public ConsumerBlockingQueue(BlockingQueue<Integer> questionqueue) {
		this.questionqueue = questionqueue;
	}
	public void run() {
		synchronized(this) {
			while(true) {
				try {
					System.out.println("Question Answered: "+questionqueue.take());
					Thread.sleep(200);
				} catch (InterruptedException e) {
				
				}
				
			}
			
		}
		
		
	}

}
