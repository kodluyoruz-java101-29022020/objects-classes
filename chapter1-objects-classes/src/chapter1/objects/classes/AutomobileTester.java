package chapter1.objects.classes;

public class AutomobileTester {

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
	
}
