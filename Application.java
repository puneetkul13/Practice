package Lesson3;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("Honda","2","blue",10000));
		carList.add(new Car("Honda","2","Yellow",15000));
		//checking for price
//		printCars(carList, new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				if(c.price>12000) {
//					return true;
//				}
//				return false;
//			}
//			
//		});
		printCars(carList, (c)->c.price>12000);
		
		Function<Car, String> priceAndColor = (c)->c.color + "FF"+ c.price;
		String result = priceAndColor.apply(carList.get(0));
		System.out.println(result);

	}
	public static void printCars(ArrayList<Car> carList, Predicate<Car> c) {
		for(Car car:carList) {
			if(c.test(car)) {
				System.out.println(car);
			}
			
		}
	}

}
interface CarCondition{
	public boolean test(Car c);
}
