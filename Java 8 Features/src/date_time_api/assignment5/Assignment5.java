package date_time_api.assignment5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment5 {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss a");
		
		System.out.println("Current Time: " + now.format(formatter));
		System.out.println("Time after 25 mins: " + now.plusMinutes(25).format(formatter));
	}

}
