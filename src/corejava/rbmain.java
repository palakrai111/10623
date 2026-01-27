package corejava;

import java.time.LocalDate;

class rbmain
{
	public static void main(String[] args) {
		Roomboooking rb = new Roomboooking(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 5),500);
		System.out.println("Check-in Date: " + rb.checkin);
		System.out.println("Check-out Date: " + rb.checkout);
		System.out.println("Total Price: $" + rb.calculateTotalPrice());
	}
}