package productmanagemetsystem;

public class MainInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService productService = new ProductService();
		productService.display();
		Product p1 = new Product(101, "Laptop", 2, 5000.0);
		Product p2 = new Product(102, "Mouse", 10, 200.0);
		Product p3 = new Product(103, "Keyboard", 5, 300.0);
		productService.addProduct(p1);
		productService.addProduct(p2);
		productService.addProduct(p3);
		productService.display();
		productService.searchProdcut(109);
		productService.removeProduct(p3);
		System.out.println("After removing Keyboard:");
		productService.display();
		productService.checkLowInventory();
		System.out.println("total value is :"+productService.totalInventoryValue());
		
	}

}
