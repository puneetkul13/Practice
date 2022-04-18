package ThreadingLesson1;

public class ThreadRunner {

	public static void main(String[] args) {
		Task task_runner = new Task("Punit--AB");
		Thread t1  = new Thread(task_runner);
		System.out.println("Starting Thread 1");
		
		t1.start();
		
		Task task_runner2 = new Task("Punit--12");
		Thread t2 = new Thread(task_runner2);
		
		System.out.println("Starting Thread 2");
		t2.start();
		
		AnotherTask task_runner3 = new AnotherTask("Shyam--AB");
		task_runner3.start();
		
		

	}

}
class Task implements Runnable{
	String name;
	
	public Task(String name) {
		super();
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i =0; i<=1000;i++) {
			System.out.println("Number: "+i+" "+ Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
class AnotherTask extends Thread{
	String name;
	public AnotherTask(String name) {
		super();
		this.name = name;
	}
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i =0;i<1000;i++) {
			System.out.println(name+" Thread Running");
		}
	}
}

