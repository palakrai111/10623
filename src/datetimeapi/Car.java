package datetimeapi;

public class Car {
	
	String Modal;
	String Brand;
	int speed;
	boolean engineOn;
	
	void startEngine() {
		engineOn = true;
		System.out.println(Brand + " " + Modal + " engine started");
	}

	void accelerate(int increaseSpeed) {
		if (engineOn) {
			speed += increaseSpeed;
			System.out.println("Car speed increased to: " + speed + " km/h");
		} else {
			System.out.println("Please start the engine first");
		}
	}
	
  
	void applyBrake()
     {
	    engineOn = false;
			speed = 0;
			System.out.println("Car engine stopped");
			
     }
}
