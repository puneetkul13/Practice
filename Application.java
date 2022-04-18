package ThreadingLesson6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable processor = (new MessageProcessor(1));
		executor.execute(processor);
		Runnable processor1 = (new MessageProcessor(2));
		executor.execute(processor);
		Runnable processor2 = (new MessageProcessor(3));
		executor.execute(processor);
		Runnable processor3 = (new MessageProcessor(4));
		executor.execute(processor);
//		executor.awaitTermination(2,TimeUnit.SECONDS);
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Stopped");
		
		
		

	}

}
