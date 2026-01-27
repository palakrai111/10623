package productmanagemetsystem;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	public List<Product> inventory;
	ProductService()
	{
		inventory =new ArrayList<Product>();
	}

	void display() 
	{
		System.out.println(inventory);
	}

	void addProduct(Product p) {
		inventory.add(p);
	}
	
	boolean searchProdcut(int id) {
		boolean found = false;
		for (Product p : inventory) {
			if (p.getId() == id) {
				found = true;
				System.out.println("Product found: " + p);
				break;
			}
		}
		return found;
     }
	
		void removeProduct(Product p) {
			boolean b = searchProdcut(p.getId());
			if (b) {
				inventory.remove(p);
			} else {
				System.out.println("Product not found, cannot remove.");
			}

		}
		
		void checkLowInventory() {
			for (Product p : inventory) {
				if (p.getQuantity() < 10) {
					System.out.println("Low inventory: " + p.getName() + " " + p.getQuantity());
				}
				
			}
		}
		
		
		int totalInventoryValue() {
			int totalValue = 0;
			for (Product p : inventory) {
				totalValue = totalValue + p.getQuantity();
			}
			return totalValue;
		}

		void addToFile() {

		}
}

