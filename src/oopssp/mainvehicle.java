package oopssp;

public class mainvehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Car myCar = new Car();
		myCar.start();  // Inherited method from Vehicle
		myCar.drive();  // Method from Car
		*/
		PetrolCar myPetrolCar = new PetrolCar();
		myPetrolCar.start();  // Inherited method from Vehicle
		myPetrolCar.drive();  // Inherited method from Car
		myPetrolCar.Petroldrive();  // Inherited method from Car
		
		DieselCar myDieselCar = new DieselCar();
		myDieselCar.start();  // Inherited method from Vehicle
		myDieselCar.drive();  // Inherited method from Car
		myDieselCar.Diseldrive();  // Inherited method from Car
	}

}
