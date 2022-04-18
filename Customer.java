package CarDealership;

public class Customer {
	private String name;
	private String address;
	private int age;
	private double cash_on_hand;
	private String phone;
	boolean finance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = "City: " + address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}
	public double getCash_on_hand() {
		
		return cash_on_hand;
	}
	public void  setCash_on_hand(double cash_on_hand) {
		cash_on_hand = cash_on_hand + 0.1*cash_on_hand;
		this.cash_on_hand = cash_on_hand;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void purchaseCar(Vehicle vehicle  ,Employee employee, boolean finance) {
		
//		Employee Shubh = new Employee();
//		Shubh.setAge("34");
//		Shubh.setDesignation("Broker");
//		Shubh.setName("Shubh");
//		Shubh.setPhone("6388354838");
		employee.handleCustomer(vehicle, this, finance);
	}
	

}
