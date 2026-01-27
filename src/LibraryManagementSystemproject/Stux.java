package LibraryManagementSystemproject;

public class Stux {
	int id;
	String name;
	float avg;
	int mark[];
	Stux(int id, String name, int mark[]) {
		System.out.println("hello");
		this.id = id;
		this.name = name;
		this.mark = mark;
		
	}

	void findAvg()
	{
		int sum = 0;
		for (int m : mark) {
			sum = sum + m;
		}
		 avg = sum / mark.length;
		System.out.println("Average marks: " + avg);
	}

	void displayInfo() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.print("Marks: ");
		for (int m : mark) {
			System.out.print(m + " ");
		}
		//System.out.println();
		System.out.println(avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks1[] = {85, 90, 78};
		Stux student1 = new Stux(1, "Alice", marks1);
		student1.findAvg();
		student1.displayInfo();
		int marks2[] = {85, 85, 85};
		Stux student2 = new Stux(1, "bob", marks2);
		student2.findAvg();
		student2.displayInfo();

	}

}
