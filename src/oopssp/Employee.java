package oopssp;

public class Employee {

	private int id;
	@Override
	public String toString() {
		return "Employee **id=" + id + ", name=" + name + ", salary=" + salary + "**";
	}

	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary >0)
		{
		this.salary = salary;
		}else {System.out.println("not valid");}
	}

	
}
