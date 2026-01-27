package rough;

public class TwoDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { { 11, 20, 2 }, { 40, 50, 6 }, { 7, 8, 9 } };
	 int sum;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a.length; j++) {
				//System.out.print(a[i][j] + " ");
				
				sum = sum + a[j][i];
			}
			System.out.println("colsum "+sum);
		}
		
		

	}

}
