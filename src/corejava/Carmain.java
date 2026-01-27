package corejava;

public class Carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Object 1
		        Car car1 = new Car();
		        car1.brand = "BMW";
		        car1.model = "X5";
		        car1.fuelType = FuelType.Diesel;

		        // Object 2
		        Car car2 = new Car();
		        car2.brand = "Honda";
		        car2.model = "City";

		        // Using object car1
		        car1.startEngine();
		        car1.accelerate(50);
		        car1.applyBrake(20);
		        car1.stopEngine();

		        System.out.println("----------------");

		        // Using object car2
		        car2.startEngine();
		        car2.accelerate(60);
		        car2.applyBrake(30);
		        car2.stopEngine();
		    }
		


	}


