package corejava;

public class Thread1 extends Thread 
{
	Printtable p;
	Thread1(Printtable p)
	{ this.p = p;
		
	}
	public void run()
	{
		p.printing(5);
	}
	
}
