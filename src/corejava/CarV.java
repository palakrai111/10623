package corejava;

public class CarV extends vehicle 
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("car started");
		
	}
	public static void main(String[] args)
	{
		vehicle c = new CarV();
				//new CarV();
		c.start();
		c.stop();
	}

}
