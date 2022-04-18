package CarDealership;

public class Employee {
	private String name;
	private String designation;
	private String age;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void handleCustomer(Vehicle vehicle, Customer customer, boolean finance) {
		double price_on_road = vehicle.getPrice_on_road();
		double cash_on_hand = customer.getCash_on_hand();
		String customer_name = customer.getName();
		String customer_phone = customer.getPhone();
//		String vehicle_full_name = vehicle.getVehicle_full_name();
		if(finance ==true ) {
			System.out.println("Our employee "+name+" will soon contact you to discuss further regarding "+vehicle+".");
			
			
		}
		else {
			if(price_on_road<=cash_on_hand) {
				System.out.println("Great. you queried about "+vehicle+ " you will soon get a call from our member "+name+" to discuss with you further.");
				
			}
			else {
				System.out.println("You do not have enough cash to buy this vehicle.");
			}
		}
		
	}
	

}
