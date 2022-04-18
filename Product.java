package ThreadingLesson3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Product {
	int id;
	String name;
	public Product(int id, String name) {
		this.id= id;
		this.name = name;
	}

}
class InventoryManager{
	List<Product> prod = new CopyOnWriteArrayList<Product>();
	public void adder() {
		
		for(int i=0;i<100;i++) {
			Product product = new Product(i,"Bottle--"+i);
			prod.add(product);
			System.out.println("Adding--"+i);
			
		}
		
		
	}
	public void displayer() {
		for(Product p:prod) {
			System.out.println("Displaying--"+p.id);
		}
		
	}
}
