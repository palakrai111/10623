package corejava;

public class Employee {
	
	
	    int id;
	    String name;
	    double salary;

	    Employee() {
	        System.out.println("Default constructor");
	    }

	    Employee(int id, String name) {
	    	this();
	        this.id = id;
	        this.name = name;
	    }

	    Employee(int id, String name, double salary) {
	        this(id, name);   // constructor chaining
	        this.salary = salary;
	    }
	    void display()
	    {
	    	System.out.println(id + " "+name + " "+salary);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"palak",1000); 
		e1.display();

	}

}
