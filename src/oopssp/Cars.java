package oopssp;

public class Cars {
	
	String cname;
	Engine e;
	Cars(String cname,Engine e)
	{
		this.cname = cname;
		this.e = e;
	}

	 void drive()
	 {
		 e.startEngine();
		 System.out.println("car is driving");
	 }
}
