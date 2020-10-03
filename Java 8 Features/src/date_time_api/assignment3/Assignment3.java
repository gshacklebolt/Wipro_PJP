package date_time_api.assignment3;

import java.time.LocalDate;
import java.time.Period;

public class Assignment3 {

	public static void main(String[] args) {
		LocalDate doj = LocalDate.of(1997, 5, 2); // Replace with any date
		LocalDate now = LocalDate.now();

		// Find the period between two dates
		Period diff = doj.until(now);

		System.out.println("Experience: " + diff.getYears() + " years, " + diff.getMonths() + " months & "
				+ diff.getDays() + " days");
	}

}
