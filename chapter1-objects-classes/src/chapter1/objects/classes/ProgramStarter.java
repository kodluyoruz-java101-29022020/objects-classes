package chapter1.objects.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class ProgramStarter {
	
	private static int ipSegmentSize = 4;
	private static String minIpAddress = "11.122.10.19";
	private static String maxIpAddress = "11.122.10.50";
	private static String ipTemplate = "11.122.10";
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
// 11.122.10.19 - 11.122.10.50 IP Bloğu Subnet IP'leri ifade eder.
// Scanner ile input alınacak
// Eğer 11.122.10 ile başlayan bir IP değilse, ekrana "Geçersiz IP" yazın.
// Eğer başlıyorsa girilen IP Subnetwork içindeki mi kontrol edin.
// Eğer subnet IP bloğuna düşüyorsa ekrana "Developer IP: <Ekrandan IP>"
// Değilse "Sistem Yöneticinize Başvurunuz!"
		
		
		putIpDefinitionMenuOnScreen();
		
		scanner.close();
	}
	
	public static void putIpDefinitionMenuOnScreen() {
		
		System.out.println("To Quit program, please press Q, To start press S");
		String pressedButton = scanner.nextLine();
		
		while(!"Q".equalsIgnoreCase(pressedButton)) {
			
			defineDeveloperIpAddress();
			System.out.println("Would you like to define another developer IP?");
			System.out.println("(If Yes, press \"Y\", If not press \"Q\")");
			pressedButton = scanner.nextLine();
		}
	}
	
	public static void defineDeveloperIpAddress() {
		
		String userDefinedIp = enterIpAddress();
		boolean validIp = validateIpTemplate(userDefinedIp);
		
		if(validIp) {
			String[] userIpSegments = splitIpSegments(userDefinedIp);
			
			boolean validSegmentSize = validateSegmentSize(userIpSegments);
			
			if(!validSegmentSize) {
				System.out.println("Invalid IP segment size!");
				return;
			}
			
			int userLastSegment = extractLastItemOfArray(userIpSegments);
			
			String[] minIpSegments = splitIpSegments(minIpAddress);
			int minLastSegment = extractLastItemOfArray(minIpSegments);

			String[] maxIpSegments = splitIpSegments(maxIpAddress);
			int maxLastSegment = extractLastItemOfArray(maxIpSegments);

			if(isSubNetworkIp(userLastSegment, minLastSegment, maxLastSegment)) {
				String formattedScreenText = 
						String.format("Developer IP defined as %s", userDefinedIp);
				System.out.println(formattedScreenText);
			}
			else{
				System.out.println("Sistem yöneticinize başvurunuz!");
			}
		}
		else {
			System.out.println("Geçersiz IP!");
		}
		
	}
	
	public static String enterIpAddress() {
		System.out.println("IP adresinizi giriniz: ");
		return scanner.nextLine();
	}
	
	public static boolean validateIpTemplate(String ipAddress) {
		
		if(ipAddress == null) {
			return false;
		}
		
		return ipAddress.startsWith(ipTemplate);
	}
	
	public static boolean validateSegmentSize(String[] userIpSegments) {
		
		if(userIpSegments == null) {
			return false;
		}
		
		return ipSegmentSize == userIpSegments.length;
	}
	
	public static String[] splitIpSegments(String ipAddress) {
		
		if(ipAddress == null) {
			return new String[0];
		}
		
		return ipAddress.split("\\.");
	}

	public static int extractLastItemOfArray(String[] ipSegments) {
		
		if(ipSegments.length > 0) {
			String lastSegment = ipSegments[ipSegments.length - 1];
			return Integer.valueOf(lastSegment);
		}
		
		return -1;
	}
	
	public static boolean isSubNetworkIp(int userLastSegment, int minLastSegment, int maxLastSegment) {
		
		return (userLastSegment >= minLastSegment && userLastSegment <= maxLastSegment);
	}
	
}
