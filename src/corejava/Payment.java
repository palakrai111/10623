package corejava;

public interface Payment 
{ 
	void makePayment(int amount);
	//void showbalc();
	default void printrcpt()
	{
		System.out.println("Receipt printed.");
		printlogdetails("Log: Receipt printed successfully.");
	}
	private void printlogdetails(String msg)
	{
		System.out.println(msg);
	}
}

class Gpay implements Payment {

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment of " + amount + " made using Gpay.");
	}
	
	
	
}

class Phonepay implements Payment 
{

	@Override
	public void makePayment(int amount) {
		// TODO Auto-generated method stub
		 System.out.println("Payment of " + amount + " made using Phonepay.");
	}
	   
}