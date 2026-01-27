package rough;

public class Stringdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname = "admin";
		String pwd = "Pass1234";
		String email = "palak@gmail.com";
		String mobile = "9876543210";
		String fileName = "resume.pdf";
		String product = "Java Programming Book";
		String sendotp = "123";
		String rcvotp = "123";
		
		if (!uname.isEmpty() && !pwd.isEmpty() && pwd.length() >= 8 && email.endsWith("@gmail.com")
				&& fileName.endsWith(".pdf") && product.contains("Java") && sendotp.equals(rcvotp)) {
			System.out.println("All validations passed. Login successful.");
		} else {
			System.out.println("Validation failed. Please check your inputs.");

		}
		
		String x= "JaVa";
		
		x.chars()
		.forEach(c -> System.out.println((char)c));
		
		
	long z=	x.chars()
			.filter(y -> y>='A' && y<='Z')
			.count();
	    System.out.println("Uppercase letters count: "+z);
		//type casting int to char
		
		/*double d = 11.123;
		int b = (int) d; 
		System.out.println(b);
		
		int l = 1;
		double m = l;
        System.out.println(m);*/
	    
	    
	    StringBuffer sb = new StringBuffer("hello");
	    //sb.append(" World");
	    
	    //sb.insert(5, "J");
	    sb.replace(2,4, "abc");
	    System.out.println(sb);
	    sb.delete(2,4);
	    System.out.println(sb);
	    
	    StringBuffer sb1 = new StringBuffer();
	    for(int i = 1; i<5; i++)
	    {
	    	sb1.append(i).append(' ');
	    }
		
		System.out.println(sb1);
		
	}

}
