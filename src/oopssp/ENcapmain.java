package oopssp;

public class ENcapmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee();
		ob.setId(101);
		ob.setName("John Doe");
		ob.setSalary(-50000);
		System.out.println("Employee Details:");
		System.out.println("ID: " + ob.getId()+ " "+ob.getName()+" Salary: "+ob.getSalary());
	}

}
