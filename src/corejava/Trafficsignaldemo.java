package corejava;

public class Trafficsignaldemo {
	
	void showsignal(TraficSignal  x)
	{
		System.out.println("Signal Color: " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trafficsignaldemo ob = new Trafficsignaldemo();
		//ob.showsignal(TraficSignal.GREEN);
		TraficSignal  x = TraficSignal.RED;
		System.out.println("Signal Color: " + x);
		
		switch(x)
		{
		case RED:
			System.out.println("STOP");
			break;
		case YELLOW:
			System.out.println("READY");
			break;
			case GREEN:
				System.out.println("GO");
				break;
		
		}

		for ( TraficSignal s : TraficSignal.values()) {
			System.out.println("Signal: " + s);
		}
		
	}

}
