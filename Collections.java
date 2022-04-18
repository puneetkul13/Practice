package Collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class Collections {

	public static void main(String[] args) {
//		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//		Vehicle vehicle1 = new Vehicle("Honda","Cityzx", "red",20000);
//		Vehicle vehicle2 = new Vehicle("Maruti", "Alto", "white", 10000);
//		Vehicle vehicle3 = new Vehicle("jeep", "Wrangler", "green", 30000);
//		vehicles.add(vehicle1);
//		vehicles.add(vehicle2);
//		vehicles.add(vehicle3);
//		for(Vehicle vehicle:vehicles) {
//			System.out.println(vehicle);
//			
//		}
//		ArrayList<Integer> values = new ArrayList<Integer>();
//		values.add(1);
//		values.add(2);
//		values.add(3);
//		int a =0 ;
//		for(int value:values) {
//			a=a+value;
//		}
//		System.out.println(a);
//		
//		int b = 0;
//		for(int i =0 ; i<values.size();i++) {
//			b=b+values.get(i);
//		}
//		System.out.println(b);
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		try {
		Pattern x = Pattern.compile(pattern);
		System.out.println(x);}
		catch(PatternSyntaxException e) {
			System.out.println("okay");
		}
		
		
		
		
		

	}

}
