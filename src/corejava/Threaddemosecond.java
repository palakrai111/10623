package corejava;

public class Threaddemosecond implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread is running" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threaddemosecond r1 = new Threaddemosecond();
		Thread t1 = new Thread(r1);
		t1.setName("MyRunnableThread-1");
		t1.start();
		Threaddemosecond r2 = new Threaddemosecond();
		Thread t2 = new Thread(r2);
		t2.setName("MyRunnableThread-2");
		t2.start();
		

	}

}
