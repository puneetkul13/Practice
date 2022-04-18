package ThreadingLesson6;

public class MessageProcessor implements Runnable {
	int message;
	public MessageProcessor(int message) {
		this.message = message;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " [Recieved] Message: "+message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		};
		System.out.println(Thread.currentThread().getName()+" [Processed] Message: "+message);
		
		
	}
	

}
