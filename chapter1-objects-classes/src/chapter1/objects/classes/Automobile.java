package chapter1.objects.classes;

public class Automobile {

	private String brand;
	private String color;
	private byte wheelCount;
	private float price;
	private byte currentGear;
	
	private GPS gps = null;
	
	public Automobile() {
		this.brand = "No brand";
		this.color = "No color";
		this.wheelCount = 0;
		this.price = 0.0f;
	}
	
	public Automobile(String brand, String color, byte wheelCount, float price) {
		this.brand = brand;
		this.color = color;
		this.wheelCount = wheelCount;
		this.price = price;
	}
	
	public Automobile(String brand, String color, byte wheelCount, float price, GPS gps) {
		this.brand = brand;
		this.color = color;
		this.wheelCount = wheelCount;
		this.price = price;
		this.gps = gps;
	}
	
	public void startEngine() {
		System.out.println("Engine started");
	}
	
	public void stopEngine() {
		System.out.println("Engine stoped");
	}
	
	public void setGear(byte gear) {
		this.currentGear = gear;
	}
	
	public byte incrementGear() {
		this.currentGear++;
		return this.currentGear;
	}
	
	public byte decrementGear() {
		this.currentGear--;
		return this.currentGear;
	}
	
	public byte getCurrentGear() {
		return this.currentGear;
	}
	
	public void changeGps(GPS gps) {
		this.gps = gps;
	}
	
	public String getCurrentLocation() {
		
		if(this.gps == null) {
			return "Your current location can not found!";
		}
		
		return this.gps.getFormattedCoordinate();
	}
}
