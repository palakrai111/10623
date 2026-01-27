package corejava;

public class OverLoadingDemo {
	
	static int getEmpDetails(int empId) {
		System.out.println("Employee ID: " + empId);
		return empId;
	}

	static int getEmpDetails(int empid
			, String empName) {
		return empid;
	}
	
	public static void main(String x)
	{
		System.out.println("Main with String arg: " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEmpDetails(101);
		getEmpDetails(102,"John Doe");
		main("Test Argument");
		System.out.println("Main method");

	}

}
