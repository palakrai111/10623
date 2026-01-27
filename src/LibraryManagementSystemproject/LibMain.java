package LibraryManagementSystemproject;

public class LibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryService libservice = new LibraryService(3);
		libservice.addBook(101, "Java Programming");
		libservice.addBook(102, "Python Programming");
		libservice.addBook(103, "Data Structures");
		System.out.println("Books in the Library:");
		libservice.displayBooks();
		System.out.println("seachbook");
		libservice.searBook(102);
		

	}

}
