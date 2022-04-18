package CarDealership;

public class Vehicle {
	private String name_of_brand;
	private String name_of_car;
	private double edition;
	private double price_on_road;
	private String colour;
	private String vehicle_full_name;
	public String getName_of_brand() {
		return name_of_brand;
	}
	public void setName_of_brand(String name_of_brand) {
		this.name_of_brand = name_of_brand;
	}
	public String getName_of_car() {
		return name_of_car;
	}
	public void setName_of_car(String name_of_car) {
		this.name_of_car = name_of_car;
	}
	public double getEdition() {
		return edition;
	}
	public void setEdition(double edition) {
		this.edition = edition;
	}
	public double getPrice_on_road() {
		return price_on_road;
	}
	public void setPrice_on_road(double price_on_road) {
		this.price_on_road = price_on_road;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getVehicle_full_name() {
		return vehicle_full_name;
	}
//	public void setVehicle_full_name() {
//		this.vehicle_full_name = name_of_brand+" "+name_of_car+" "+edition;
//	}
	@Override
	public String toString() {
		return "Vehicle [name_of_brand=" + name_of_brand + ", name_of_car=" + name_of_car + ", edition=" + edition
				+ ", colour=" + colour + "]";
	}
	
	

}
