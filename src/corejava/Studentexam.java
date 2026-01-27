package corejava;
import java.util.Scanner;
public class Studentexam {
	int id;
	String name;
	
	double percentage;
	
	String result;
	Scanner sc = new Scanner(System.in);
	void acceptInfo()
	{
		System.out.println("Enter Student ID: ");
		id = sc.nextInt();
		System.out.println("Enter Student Name: ");
		name = sc.next();
		System.out.println("Enter Percentage: ");
		percentage = sc.nextDouble();
	
	}

	void displayInfo() {
		
			System.out.println("Student ID: " + id);
			System.out.println("Student Name: " + name);
			System.out.println("Percentage: " + percentage);
			System.out.println("Result " + result);
		
		
	}
     static double totalscore = 0;

 double totalmarks(Studentexam students[]) {
		for (Studentexam s : students) {
			if (s != null) {
				totalscore += s.percentage;
			}
		}
		return totalscore;
	}

		
		 void checkPassOrFail(Studentexam students[])
		{
			for (Studentexam s : students) {
				 if (s != null) {
		                s.result = (s.percentage >= 40) ? "Pass" : "Fail";
		                s.displayInfo();
		            }
			}
            
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Studentexam student1 = new Studentexam();
	   /*	Studentexam student2 = new Studentexam();
		student1.acceptInfo();
		student1.displayInfo();
		student2.acceptInfo();
		student2.displayInfo();*/
		Studentexam students[] = new Studentexam[3];
		for (int i = 0; i < 2; i++) {
			students[i] = new Studentexam();
			students[i].acceptInfo();
		}
		/*for (int i = 0; i < 2; i++) {
			
			students[i].displayInfo();
		}*/
		
    System.out.println("Total Marks of Students: " + student1.totalmarks(students));
    
      
    System.out.println("\n----- Student Results -----");
    student1.checkPassOrFail(students);

			   // student1.checkPassOrFail(students);
	}

       
       
       
}
