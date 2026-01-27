package datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class Dateapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: " + today);
		LocalDate specificDate = LocalDate.of(2025, Month.JULY, 20);
		System.out.println("Specific date: " + specificDate);
		LocalDate dx = specificDate.plusDays(15);
		System.out.println("After adding 15 days: " + dx);
		LocalDate dy = specificDate.minusMonths(2);
		System.out.println("After subtracting 2 months: " + dy);
		boolean isLeapYear = specificDate.isLeapYear();
		System.out.println("Is the year a leap year? " + isLeapYear);
        System.out.println(specificDate.isBefore(today));
	}

}
