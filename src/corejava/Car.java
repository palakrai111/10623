package corejava;

public class Car {

	
	    // Properties (Instance Variables)
	    String brand;
	    String model;
	    int speed;
	    FuelType fuelType;
	    boolean engineOn;

	    // Method to start the car
	    void startEngine() {
	        engineOn = true;
	        System.out.println(brand + " " + model+" "+fuelType + " engine started");
	    }

	    // Method to accelerate
	    void accelerate(int increaseSpeed) {
	        if (engineOn) {
	            speed += increaseSpeed;
	            System.out.println("Car speed increased to: " + speed + " km/h");
	        } else {
	            System.out.println("Please start the engine first");
	        }
	    }

	    // Method to apply brake
	    void applyBrake(int decreaseSpeed)
	    {
	        if (engineOn && speed > 0) 
	        {
	            speed -= decreaseSpeed;
	            if (speed < 0) {
	                speed = 0;
	            }
	            System.out.println("Car speed reduced to: " + speed + " km/h");
	        }
	    }

	    // Method to stop engine
	    void stopEngine() {
	        engineOn = false;
	        speed = 0;
	        System.out.println("Car engine stopped");
	    }
	}


