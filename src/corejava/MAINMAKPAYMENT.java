package corejava;

public class MAINMAKPAYMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p = new Gpay();
		p.makePayment(1000);
		p.printrcpt();
		Payment p1 = new Phonepay();
		p1.makePayment(1000);
		p1.printrcpt();
	}

}
