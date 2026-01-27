package rough;

public class Librarymanagementsystem {

	  Libray books[];
	  int count = 0;
	  int size;
	 Librarymanagementsystem(int size)
	 {
		 this.size = size;
		 books= new Libray[size];
	 }
	 
		void addBook(int bid, String bname)
		{
			if (count < size) {
				books[count] = new Libray(bid, bname);
				count++;
			} else {
				System.out.println("Library is full. Cannot add more books.");
			}
		}
		
		void displayBooks() {
			for(Libray 	x: books) {
                if(x != null) {
                    x.displayInfo();
                    //return;
                  
                }
                System.out.println("kkk");
            
		}
		}
		void searBook(int bid) {
            for (Libray x : books) {
                if (x != null && x.bid == bid) {
                    System.out.println("Book Found:");
                    x.displayInfo();
                    return;
                }
            }
            System.out.println("Book with ID " + bid + " not found.");
        }
        
		
		public static void main(String[] args) {
			Librarymanagementsystem library = new Librarymanagementsystem(3);

			library.addBook(101, "Java Programming");
			library.addBook(102, "Data Structures");
			library.addBook(103, "Database Systems");

			System.out.println("Books in the Library:");
			library.displayBooks();
			library.searBook(102);
		}
}
