package corejava;

public class withdrathread extends Thread
{
	Bankdemo b;

	withdrathread(Bankdemo b) {
		this.b = b;
		
	}
	
	public void run() {
		b.withdraw(2500);
	}
}
