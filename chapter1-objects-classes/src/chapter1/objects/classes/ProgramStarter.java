package chapter1.objects.classes;

public class ProgramStarter {
	
	public static void main(String[] args) {
		
		byte wheelCount = 4;
		
		Automobile bmw = new Automobile("BMW", "Black", wheelCount, 250000.0f);
		Automobile mercedes = new Automobile("Mercedes", "White", wheelCount, 350000.0f);

		GPS siemensGps = new GPS();

		String result = String.valueOf(6);
		
		AutomobileTester.testAutomobile(bmw, siemensGps);
		AutomobileTester.testAutomobile(mercedes, null);
	}

}
