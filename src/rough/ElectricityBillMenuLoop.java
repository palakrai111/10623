package rough;

import java.util.Scanner;

public class ElectricityBillMenuLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		        Scanner sc = new Scanner(System.in);
		        int choice;
		        int units;
		        double bill;

		        do {
		            System.out.println("\n----- Electricity Bill Menu -----");
		            System.out.println("1. Units 0 - 100   (₹5 per unit)");
		            System.out.println("2. Units 101 - 200 (₹7 per unit)");
		            System.out.println("3. Units 201 - 300 (₹10 per unit)");
		            System.out.println("4. Units above 300 (₹12 per unit)");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            if (choice == 5) {
		                System.out.println("Exiting program...");
		                break;
		            }

		            System.out.print("Enter units consumed: ");
		            units = sc.nextInt();
		            bill = 0;

		            switch (choice) {
		                case 1:
		                    bill = units * 5;
		                    break;

		                case 2:
		                    bill = units * 7;
		                    break;

		                case 3:
		                    bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
		                    break;

		                case 4:
		                    bill = (100 * 5) + (100 * 7) + (100 * 10) + (units - 300) * 12;
		                    break;

		                default:
		                    System.out.println("Invalid choice!");
		                    continue;
		            }

		            System.out.println("Total Electricity Bill = ₹" + bill);

		        } while (choice != 5);

		        sc.close();
		    }
		


	

}
