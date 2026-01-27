package corejava;

import java.util.Arrays;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = List.of("Apple", "Banana", "Cherry");//List.of is used to crete immutable list
		//list.add("Mango"); // This will throw UnsupportedOperationException

		String fruit[]= {"Apple", "Banana", "Cherry"};
		List<String> list2 = Arrays.asList(fruit); // Create a copy of the immutable list
		
		fruit[0]="keewi"; //modifying original array will reflect in the list created using Arrays.asList"
		for (String fruit1 : list2) {
			System.out.println(fruit1);
			
			System.out.println("---------");
			for (String x : fruit) 
			{
				System.out.println(x);
			}

		}
	}

}
