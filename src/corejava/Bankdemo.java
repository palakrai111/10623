package corejava;

public class Bankdemo {
	int balance = 2000;
	synchronized void withdraw(int wa) {
		System.out.println(wa + " withdrawn");
		if (wa > balance) {
			System.out.println("insufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance - wa;
		System.out.println("current balance is " + balance);
	}
	
	synchronized void deposit(int da) {
		balance = balance + da;
		System.out.println("after depositing amount is " + balance);
		notify();
	}

}
