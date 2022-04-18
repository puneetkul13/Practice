package Generics;

import java.util.ArrayList;

public class WildCard {

	public static void main(String[] args) {
		ArrayList<?> val = new ArrayList<>();
		ArrayList<Accountant> emp = new ArrayList<>();
		emp.add(new Accountant());
		val  = emp;
		working(emp);
		Object new_obj = new Object();
		Accountant emp1 = new Accountant();
		new_obj = emp1;
		((Accountant) new_obj).work();
		Employees emp2 = new Employees();
		emp2 = emp1;
		emp2.work();
		
		
		

	}
	public static void working(ArrayList<Accountant> x) {
		for(Accountant emp:x) {
			emp.work();
		}
		
	}

}
