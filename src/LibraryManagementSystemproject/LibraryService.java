package LibraryManagementSystemproject;

import java.util.Scanner;

public class LibraryService {
	
	Library books[];
	int size;
	int count =0;
	LibraryService(int size)
	{
		this.size = size;
       books= new Library[size];
	}
   Scanner sc = new Scanner(System.in);
	void addBook(int bid, String name) {
		
		Library b1 = new Library(bid, name);
		books[count] = b1;
		count++;
	}

	void displayBooks() {
		for (Library x : books) {
			if (x != null) {
				x.displayInfo();
			}
		}
	}

	void searBook(int bid) {
		for (Library x : books) {
			if (x != null && x.bid == bid) {
				System.out.println("Book Found:");
				x.displayInfo();
				return;
			}
		}
		System.out.println("Book with ID " + bid + " not found.");
	}
}
