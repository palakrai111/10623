package corejava;

public class Printtable {
	
	synchronized public void printing(int n)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
