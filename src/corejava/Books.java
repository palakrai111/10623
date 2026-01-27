package corejava;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Books {
	
	int id;
	String title;

	Books(int id, String title) {
		this.id = id;
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return id == other.id && Objects.equals(title, other.title);
	}
	
	
	public static void main(String[] args) {
		Books b1 = new Books(1, "Java Programming");
		Books b2 = new Books(1, "Java Programming");

		
		Set<Books> s = new HashSet<Books>();
		s.add(b2);
		s.add(b1);
		System.out.println("Size of set: " + s.size());
		
		//System.out.println();
		System.out.println("HashCode of b1: " + b1.hashCode());
		System.out.println("HashCode of b2: " + b2.hashCode());

		if (b1.equals(b2)) {
			System.out.println("b1 is equal to b2");
		} else {
			System.out.println("b1 is not equal to b2");
		}
	}

}
