package chapter1.objects.classes;

public class ProgramStarter {

	public static void main(String[] args) {
		
		byte wheelCount = 4;
		byte gear = 2;
		
		Automobile bmw = new Automobile("BMW", "Black", wheelCount, 250000.0f);
		//Automobile mercedes = new Automobile("Mercedes", "White", wheelCount, 350000.0f);

		/*
		 * BMW aracı GPS cihazı barındırır
		 */
		
		GPS siemensGps = new GPS();
		siemensGps.setCoordinate(35.23423f, 27.23423f);
		
		bmw.changeGps(siemensGps);
		
		bmw.startEngine();
		bmw.setGear(gear++);
		
		String currentLocation = bmw.getCurrentLocation();
		System.out.println(currentLocation);
		
		bmw.stopEngine();
	}

}
