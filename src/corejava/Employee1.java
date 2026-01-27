package corejava;

public class Employee1 {
	
	int id;
	String name;

	void displayInfo() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
	}
	

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name ;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 person1 = new Employee1();
		person1.id = 101;
		person1.name = "John Doe";
		System.out.println(person1);
	}

}
