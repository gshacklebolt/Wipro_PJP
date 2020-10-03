package date_time_api.assignment6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment6 {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss a");
		
		System.out.println("Current Time: " + now.format(formatter));
		System.out.println("Time before 5 hours and 30 mins: " 
								+ now.minusHours(5).minusMinutes(30).format(formatter));
	}

}
