package corejava;

public class Student {
	
	// Properties (Instance Variables)
	String name;
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getStudentID() {
		return studentID;
	}



	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}



	public int getCgpa() {
		return cgpa;
	}



	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}



	int age;
	int studentID;
	static String schoolName = "ABC University";
	int cgpa;

	// Method to display student information
	void displayInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Student ID: " + studentID);
		System.out.println("School Name: " + schoolName);
		System.out.println("CGPA: "+ cgpa );
		
	}
	
	

	/*int percentage(int y) 
	{
		int x = cgpa * 9/y;
		return x; // Dummy percentage
	}*/
	public static void main(String[] args) {
		// Create a Student object
		Student student1 = new Student();
		
		student1.setName("Alice");
		//student1.getName();
		student1.setAge(20);
		student1.setStudentID(1);
		student1.setCgpa(8);
		
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Student ID: " + student1.getStudentID());
		System.out.println("CGPA: " + student1.getCgpa());
		
		
		//student1.name = "Alice";
		/*student1.age = 20;
		student1.studentID = 1;
		student1.cgpa = 8;*/

		// Display student information
		//student1.displayInfo();
		
		/*int y = student1.percentage(8);
		System.out.println("Percentage: " + y + "%");
		
		Student student2 = new Student();
		student2.name = "Bob";
		student2.age = 21;
		student2.studentID = 2;
		student2.displayInfo();*/
		
		
	}

}
