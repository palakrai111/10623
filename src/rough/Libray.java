package rough;

public class Libray {
	
	int bid;
	String bname;
	Libray(int bid,String bname)
	{
		this.bid=bid;
		this.bname=bname;
	}

	void displayInfo() {
		System.out.println("Book ID: " + bid);
		System.out.println("Book Name: " + bname);
	}
}
