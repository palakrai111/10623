package corejava;

import java.util.ArrayList;
import java.util.List;

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList();
		l1.add("Hello");
		l1.add("123");
		l1.add("45.67");
		System.out.println(l1);
		List<Integer> l2 = new ArrayList<>();
		l2.add(100);
		l2.add(200);
		//l2.addAll(l1);
		//l2.add("Hello"); // This will cause a compile-time error"
		System.out.println(l2);
		//l2.clear();
		System.out.println(l2);
	   if(l2.contains(100))
		{
		   System.out.println("Element is found");
		} else {
			System.out.println("Element not found");
		}
	   l2.remove(0);
	   System.out.println("After removing element");
	   System.out.println(l2);
	   Studentmain s1 = new Studentmain(101, "abc");
	   Studentmain s2 = new Studentmain(102, "def");
	   Studentmain s3 = new Studentmain(103, "ghi");
	   List<Studentmain> studentlist = new ArrayList<>();
	   studentlist.add(s1);
	   studentlist.add(s2);
	   studentlist.add(s3);
	   studentlist.remove(s2);
		for (Studentmain s : studentlist) {
			System.out.println(s.id + " " + s.name);
		}
	   
   
	}

}
