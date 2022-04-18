package MultiThreadingGCornell;

public class Adder {
	int res=0;
	public int increment() {
		synchronized(this) {
			this.res +=1;
			return this.res;
		}
		
		
	}

}
