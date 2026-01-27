package oopssp;

public class Employees {
	int id;
	String name;

	Employees(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

}

class Manager extends Employees {
	int salary;

	Manager(int id, String name, int salary) {
		super(id, name);
		this.salary = salary;
		
	}
	 
void display()
{
	System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
}
	
}