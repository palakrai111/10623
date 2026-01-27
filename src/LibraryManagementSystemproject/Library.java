package LibraryManagementSystemproject;

public class Library {
	
	int bid;
	String name;

	Library(int bid, String name) {
		this.bid = bid;
		this.name = name;
	}

	void displayInfo() {
		System.out.println("Book ID: " + bid);
		System.out.println("Book Name: " + name);
	}

}
