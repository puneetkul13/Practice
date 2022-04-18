package CarDealership;

public class CarDealership {

	public static void main(String[] args) {
		Customer Punit = new Customer();
		Punit.setName("Punit Agarwal");
		Punit.setAddress("Jhansi");
		Punit.setAge(25);
		Punit.setPhone("6388354838");
		Punit.setCash_on_hand(10000);
		Employee Shubh = new Employee();
		Shubh.setAge("34");
		Shubh.setDesignation("Broker");
		Shubh.setName("Shubh");
		Shubh.setPhone("6388354838");
		Vehicle new_car = new Vehicle();
		new_car.setColour("Blue");
		new_car.setEdition(2);
		new_car.setName_of_brand("Maruti");
		new_car.setName_of_car("Safari");
		new_car.setPrice_on_road(12000);
//		new_car.setVehicle_full_name();
		Punit.purchaseCar(new_car, Shubh, true );
		

	}

}
