package oopssp;

public class Vehicle {
	
	void start() {
		System.out.println("Vehicle started");
	}

}
class Car extends Vehicle
{
	void drive() {
		System.out.println("Car started");
	}
}

class PetrolCar extends Cars {
	void Petroldrive() {
		System.out.println("petrol car");
	}
}
class DieselCar extends Cars {
	void Diseldrive() {
		System.out.println("Diesel car");
	}
}
