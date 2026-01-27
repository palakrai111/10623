package corejava;

public class TrafficSignalp {
	static TrafficSignal signal;
	
 static	void changeSignal(TrafficSignal s)
	{
		signal=s;
	}

	static void displaySignal() {
		switch (signal) {
		case RED:
			System.out.println("STOP");
			break;
		case YELLLOW:
			System.out.println("READY");
			break;
		case GREEN:
			System.out.println("GO");
			break;
		default:
			System.out.println("INVALID SIGNAL");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficSignalp.changeSignal(TrafficSignal.RED);
		TrafficSignalp.displaySignal();
		TrafficSignalp.changeSignal(TrafficSignal.YELLLOW);
		TrafficSignalp.displaySignal();
		TrafficSignalp.changeSignal(TrafficSignal.GREEN);
		TrafficSignalp.displaySignal();

	}

}
