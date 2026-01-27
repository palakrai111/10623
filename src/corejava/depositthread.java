package corejava;

public class depositthread extends Thread
{
	Bankdemo b;

	depositthread(Bankdemo b) {
		this.b = b;
		
	}
	
	public void run() {
		b.deposit(3000);
	}
}
