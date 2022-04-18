package JavaBasics;

public class ForLoop {

	public static void main(String[] args) {
//		String s = "abcdefgtahsjahkls";
//		for(int i= s.length()-1;i>=0;i--) {
//			System.out.println("char :" + s.charAt(i));
//		}
		int counter = 0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println("even number:" + Integer.toString(i));
			}
			counter = counter+1;
		}
		
		System.out.println(counter);
		

	}

}
