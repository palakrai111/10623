package rough;

public class Employee {
	int eid;
	String ename;
	int fees;
	Employee(int e, String n) {
		eid = e;
		ename =n;
	}

	Employee(int e, String n,int f) {
		this(e,n);
	     fees=f;
	}
	

	void displayInfo() {
       System.out.println("Employee ID: " + eid);
       System.out.println("Employee Name: " + ename);
       
       System.out.println("Employee fees: " + fees);
	}
	
	void show() {
		System.out.println("Hello i am show method");
		this.displayInfo();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,"Alice");
		//emp.displayInfo();
		emp.show();
		Employee emp2 = new Employee(102,"Bob",5000);
		//emp2.displayInfo();
		emp2.show();

	}

}
