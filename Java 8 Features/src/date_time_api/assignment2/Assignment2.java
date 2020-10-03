package date_time_api.assignment2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment2 {

	public static void main(String[] args) {
		LocalDate nextMonth = LocalDate.now().plusMonths(1);

		LocalDate nextMonthSecondSunday = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

		System.out.println("Date on next month's 2nd Sunday: " + nextMonthSecondSunday);

	}

}
