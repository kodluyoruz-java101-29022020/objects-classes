package chapter1.objects.classes;

public class GPS {

	private float latitude;
	private float longitude;
	
	public GPS() {
		this.latitude = 0.0f;
		this.longitude = 0.0f;
	}
	
	public void setCoordinate( float latitude, float longitude ){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getFormattedCoordinate() {
		
		String locationInformation = "Latitude: " + this.latitude + "Longitude: " + this.longitude;
		return locationInformation;
	}
	
}
