package rough;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 20, 3, 40, 50};
		/*for (int i : a) {
			System.out.println(i);
		}*/
		
		int key = 30;
		int i = 0;
		boolean found = false;
		for (i = 0; i < a.length; i++) {
			if (a[i] == key) {
				//System.out.println("Element found at index: " + i);
				found = true;
				break;
			}
			
		}
		if (found) {
			System.out.println("Element found in the array." + i);
		}
		else {
			System.out.println("Element not found in the array.");
		}

	}

}
