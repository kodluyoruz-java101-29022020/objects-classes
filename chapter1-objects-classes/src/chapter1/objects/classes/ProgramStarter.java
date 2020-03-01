package chapter1.objects.classes;

public class ProgramStarter {

	public static void testAutomobile(Automobile automobile, GPS gps) {
		
		if(gps != null) {
			gps.setCoordinate(35.23423f, 27.23423f);
		}
		
		automobile.changeGps(gps);
		
		automobile.startEngine();
		
		System.out.println(automobile.incrementGear());
		System.out.println(automobile.incrementGear());
		System.out.println(automobile.incrementGear());
		
		System.out.println(automobile.decrementGear());
		
		String currentLocation = automobile.getCurrentLocation();
		System.out.println(currentLocation);
		
		automobile.stopEngine();
	}
	
	public static void main(String[] args) {
		
		byte wheelCount = 4;
		
		Automobile bmw = new Automobile("BMW", "Black", wheelCount, 250000.0f);
		Automobile mercedes = new Automobile("Mercedes", "White", wheelCount, 350000.0f);

		GPS siemensGps = new GPS();

		testAutomobile(bmw, siemensGps);
		testAutomobile(mercedes, null);
	}

}
