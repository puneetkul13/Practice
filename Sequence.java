package ThreadingLesson2;

public class Sequence {
	int value = 0;
	public synchronized int sqs() {
		
			value++;
			return value;
		
		
	}

}
