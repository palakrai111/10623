package corejava;

public class Threaddemo extends Thread {
	public void run() {
		for(int i=1;i<=5;i++)
		{
		System.out.println("Thread is running"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threaddemo t1 = new Threaddemo();
		t1.setName("MyThread-1");
		t1.start();
		//t1.run();  //direct method call
		Threaddemo t2 = new Threaddemo();
		t2.setName("MyThread-2");
		t2.start();
		//t2.run();  //direct method call
		Threaddemo t3 = new Threaddemo();
		t3.setName("MyThread-3");	
		//t3.run();  //direct method call
		t3.start();
		

	}

}
