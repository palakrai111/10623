package corejava;

import java.time.LocalDate;
import java.time.Period;

 class booking {
	LocalDate checkin;
	LocalDate checkout;

	booking(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

}
class Roomboooking extends booking
{int ppd;
	
	Roomboooking(LocalDate checkin, LocalDate checkout,int ppd) {
        super(checkin, checkout);
        this.ppd=ppd;
        // TODO Auto-generated constructor stub
    }

	int calculateTotalPrice() {
		
		Period p = Period.between(checkin, checkout);
		return ppd * p.getDays(); 
	}
}
