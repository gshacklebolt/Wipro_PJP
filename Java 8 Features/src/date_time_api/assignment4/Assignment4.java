package date_time_api.assignment4;

import java.time.LocalDate;

public class Assignment4 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();

		System.out.println(now.getYear() + " is leap year: " + now.isLeapYear());
	}

}
