package corejava;

public class Thread2 extends Thread 
{
	Printtable p;
	Thread2(Printtable p)
	{ this.p = p;
		
	}
	public void run()
	{
		p.printing(10);
	}
	
}
