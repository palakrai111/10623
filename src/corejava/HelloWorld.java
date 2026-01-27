package corejava;
import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
		int a = 8;
		int b = 9;
		int c = a&b;
		System.out.println(c);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("enter gender");
		char gender = sc.next().charAt(0); //palak
		
		System.out.println("Hello " + name + " your age is " + age+""+gender);
		
		

	}

}
