package corejava;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      LocalDate today = LocalDate.now();
      System.out.println("Today's Date: " + today);
      LocalDate specificDate = LocalDate.of(2025, 1, 10);
      System.out.println("Specific Date: " + specificDate);
      LocalDate newDate = today.plusDays(3);
      System.out.println("Date after adding 3 days: " + newDate);
      LocalDate previousDate = today.minusDays(2);
      System.out.println("Date after subtracting 2 days: " + previousDate);
      
      Period p =Period.between(today, specificDate);
      System.out.println("Period between specific date and today: " + p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days");
	}

}
