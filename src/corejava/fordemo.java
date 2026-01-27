package corejava;

public class fordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int esum = 0;
		int oprod = 1;
		for (int i = 1; i <=5; i++) {
			if(i%2==0) {
                esum = esum + i;
            } else {
                oprod = oprod * i;
            }
			
		}
		System.out.println("even sum is " + esum);
		System.out.println("odd product is " + oprod);
		
		
		
		for(int i = 0 ; i < 5; i++)
        {
			            char ch = 'A';
            for(int j = 0; j <= i; j++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
		
		int no = 151;
		int temp = no;
		double sum = 0;
		while (no != 0) {
			int digit = no % 10;
			sum = sum + Math.pow(digit, 3);
			no = no / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");
		}
		
		

	}

}
