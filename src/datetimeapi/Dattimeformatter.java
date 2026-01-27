package datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dattimeformatter {
	
	
	
	// Display givenDate in dd/MMMM/yyyy format
	public static void convertLocalDateToString(LocalDate localDate, String format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		String stringDate = localDate.format(formatter);
		System.out.println("Before: " + localDate + ", After: " + stringDate);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate givenDate = LocalDate.of(2023, 6, 9);

		
		
		convertLocalDateToString(givenDate, "dd/MMMM/yyyy");
		// Display givenDate in dd/MMMM/yy format
		convertLocalDateToString(givenDate, "dd/MMMM/yy");
		// Display givenDate in dd/MMM/yyyy format
		convertLocalDateToString(givenDate, "dd/MMM/yyyy");
		// Display givenDate in dd/MM/yyyy format
		convertLocalDateToString(givenDate, "dd/MM/yyyy");
		// Display givenDate in dd/M/yyyy format
		convertLocalDateToString(givenDate, "dd/M/yyyy");
		// Display givenDate in d/MMMM/yyyy format
		convertLocalDateToString(givenDate, "d/MMMM/yyyy");
		// Display givenDate in EEEE dd/MMMM/yyyy format
		convertLocalDateToString(givenDate, "EEEE dd/MMMM/yyyy");
		// Display givenDate in EEE dd/MMMM/yyyy format
		convertLocalDateToString(givenDate, "EEE dd/MMMM/yyyy");

	}

}
