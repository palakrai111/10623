package rough;

public class ad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 20, 30, 40, 50};
		for (int i : a) {
			System.out.println(i);
		}
		
		stu s[] = new stu[2];
		s[0] = new stu(101, "Alice");
		s[1] = new stu(102, "Bob");
		for (stu st : s) {
			System.out.println(st.id + " " + st.name);
		}

	}

}
