package rough;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentexamSystem student = new StudentexamSystem();
		StudentexamSystem students[] = new StudentexamSystem[3];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new StudentexamSystem();
			students[i].acceptInfo();
		}
        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
			
			students[i].displayInfo();
        }
        
        
        int total = StudentexamSystem.totalMarks(students);
        System.out.println("\nTotal Marks of all Students: " + total);
        
       // System.out.println("\nStudent Results:");
       student.testresult(students);
	}

}
