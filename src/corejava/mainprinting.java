package corejava;

public class mainprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printtable ob = new Printtable();
		/*Thread1 t1 = new Thread1(
				ob);
		Thread2 t2 = new Thread2(ob);
		t1.start();
		t2.start();*/
		Thread  t1 = new Thread(
				
				() -> {
					ob.printing(5);
				});
		Thread t2 = new Thread(

				() -> {
					ob.printing(10);
				});
		t1.start();
		t2.start();
		
		
		
	}

}
