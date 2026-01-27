package datetimeapi;

public class Cardriverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.Brand = "Toyota";
		myCar.Modal = "Corolla";
		//myCar.startEngine();
		
		myCar.applyBrake();
		myCar.accelerate(70);
		myCar.startEngine();
		myCar.accelerate(70);

	}

}
