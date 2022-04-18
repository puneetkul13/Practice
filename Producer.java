package ThreadingLesson5;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Integer> questionQueue;
	int questionNo;
	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}
	@Override
	public void run() {
		while(true) {
			synchronized(this) {
				questionNo++;
				try {
					questionQueue.put(questionNo);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("New Question Added: "+questionNo);
			}
			
		}
		
		
		
	}

}
