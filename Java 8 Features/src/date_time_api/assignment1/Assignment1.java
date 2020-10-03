package date_time_api.assignment1;

import java.time.LocalDate;

public class Assignment1 {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now();
		
		System.out.println("Today's date: "+now);
		System.out.println("Date after 10 days: "+now.plusDays(10));
	}

}
