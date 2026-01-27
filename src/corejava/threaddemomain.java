package corejava;

public class threaddemomain {
	public static void main(String[] args) {
	Bankdemo ob= new Bankdemo();
	//withdrathread t1 = new withdrathread(ob);
	//depositthread t2 = new depositthread(ob);
	
	
	Thread t1 = new Thread
			( () ->{ob.withdraw(2500);}
					
					);
	Thread t2 = new Thread
			( () ->{ob.deposit(1500);}
					
					);
	t1.start();
	t2.start();
	}
}
