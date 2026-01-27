package rough;

import java.util.Scanner;

public class StudentexamSystem {
	
	int id;
	String name;
	int marks;
	String result;
 Scanner sc = new Scanner(System.in);
	void acceptInfo() {
		System.out.println("Enter Student ID: ");
		id = sc.nextInt();
		System.out.println("Enter Student Name: ");
		name = sc.next();
		System.out.println("Enter Marks: ");
		marks = sc.nextInt();

	}

	
	void displayInfo() {

            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Result: " + result);
}
	
static int totalMarks(StudentexamSystem students[]) {
	int total = 0;
	
	/*
	 * for (int i = 0; i < students.length; i++) { if(students[i] != null) { total
	 * += students[i].marks; } }
	 */
	for (StudentexamSystem student : students) {
		if (student != null) {
			total += student.marks;
		}
	}
	return total;
}
void testresult(StudentexamSystem Student[])
{
	for (StudentexamSystem x : Student) {
		
		if(x != null)
		{
			x.result = (x.marks >= 40) ? "Pass" : "Fail";
		}
	   x.displayInfo();	
	}
	
	
}

	
}