package ExceptionHandling;

import java.util.Scanner;

public class Addition {
	
		public static int add(int x, int y) throws Exception {
			if(x>=0 && y>=0) {
				return(x+y);
			}
			else if(x<0 && y<0) {
				throw new Exception("x and y both can't be negative.");
				
			}
			else if(x<0 && y>0) {
				throw new Exception("x can't be negative.");
			}
			else if(x>0 && y<0) {
				throw new Exception("y can't be negative.");
			}
			return (x+y);
			
		}
}
class Division{
	public static double uniqueDivision(int x) throws Exception {
		int y=x;
		System.out.println("One");
		y = 5/x;
		System.out.println("Two");
		return (5/(x+2));
	}
}
class Array{
	public static int min(int [] b, int m, int n) throws Exception {
		
		
	
		try {
			int min = b[m];
			for(int i=m+1;i<=n;i++) {
				if(b[i]<=min) {
					min = b[i];
				}
			}
			return min;
		}
		catch(Exception e) {
			throw new Exception("An Exception Occured...");
		}
		
		
		
	}
}
class B{
	public static void first(int i) {
		try {
//			if(i==0) {throw new Exception("Number can't be zero");}
			System.out.println(0);
			second(i);
			System.out.println(1);
		}
		catch(Exception e) {
			System.out.println(2);
		}
		
	}
	public static void second(int i) throws Exception {
		System.out.println(3);
		try {
			int b = 5/i;
			System.out.println(4);
			if(i==6) {throw new Exception();}
			System.out.println(5);
			
			
		}
		catch(Exception e) {
			System.out.println(6);
		}
		System.out.println(7);
	}
	
}
class Parsing{
	public static void parse() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Number");
			String s = sc.nextLine();
			int a=1;
			try {
			a = Integer.parseInt(s);}
			catch(Exception e) {
				Exception e1 = new Exception("Entered first input is invalid, taking it as 1...");
//				System.out.println("Entered first input is invalid, taking it as 1....");
				System.out.println(e1);
			}
			System.out.println("Enter the Second Number");
			String s1 = sc.nextLine();
			int b = 1;
			try {
				b = Integer.parseInt(s1);
			}
			catch(Exception e) {
				Exception e2 = new Exception("Entered first input is invalid, taking it as 1...");
//				System.out.println("Entered second input is invalid, taking it as 1....");
				System.out.println(e2);
			}
			int c = a*b;
			System.out.println("Product--"+c);
		}catch(Exception e) {
			System.out.println("An unknown Exception Occured");
		}
		
	}
}
class MyException extends RuntimeException{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

