package MultiThreadingGCornell;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Product {
	int id;
	String name;
	public Product(int id, String name) {
		this.id = id;
		this.name  = name;
	}

}
class InventoryManager{
	CopyOnWriteArrayList<Product> p = new CopyOnWriteArrayList<>();
//	ArrayList<Product>  p= new ArrayList<>();
	public void adder() throws InterruptedException {
		for(int i=0;i<1000;i++) {
			Product p1 = new Product(i, "Bottle--"+i);
			p.add(p1);
			
			System.out.println("added--"+p1.name);
		}
	}
	public void displayer() throws InterruptedException {
		
		for(Product p1:p) {
			System.out.println("displaying--"+p1.name);
			
		}
	}
}
