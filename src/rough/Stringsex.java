package rough;

public class Stringsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Login System – Username Validation
		String username = "admin";

		if (!username.isEmpty()) {
		    System.out.println("Username accepted");
		} else {
		    System.out.println("Username cannot be empty");
		}
		
		//passw validation
		String password = "Pass1234";

		if (password.length() >= 8) {
		    System.out.println("Valid password");
		} else {
		    System.out.println("Weak password");
		}

		//email validation
		String email = "user@gmail.com";

		if (email.endsWith("@gmail.com")) {
		    System.out.println("Valid Gmail account");
		}
		else {
			System.out.println("Invalid Gmail account");
		}
		
		//mobile masking
		String mobile = "9876543210";
		String x = "*";

		String masked = mobile.substring(0, 2) + x.repeat(6) + mobile.substring(8);
		System.out.println(masked);
		
		
		//file extension validation
		String fileName = "resume.pdf";

		if (fileName.endsWith(".pdf")) {
		    System.out.println("File accepted");
		}
		
		//search functionality
		String product = "Java Programming Book";

		if (product.contains("Java")) {
		    System.out.println("Product found");
		}

		//convert to uppercase
		String studentName = "palak";

		System.out.println(studentName.toUpperCase());

		//otp validation
		String otpSent = "123456";
		String otpEntered = "123456";

		if (otpSent.equals(otpEntered)) {
		    System.out.println("OTP verified");
		}

		
		//Count Spaces in a Sentence

		//Scenario: Word count logic

		String sentence = "Java Full Stack Course";

		/*long spaces = sentence.chars()
		        .filter(ch -> ch == ' ')
		        .count();*/
		
		
		
		long spaces =sentence.chars()
		.filter(ch -> ch == ' ')
		.count();
		
		long charc =sentence.chars()
				.filter(ch -> ch != ' ')
				.count();
			
		

		System.out.println(charc);
		
		
		//uppercase
		String up = "HeLlo world";
		long upc = up.chars()
				.filter( Character::isUpperCase)
				.count();

		System.out.println("uppercase letters: "+upc);
		
		
		
		//Check If String Contains Only Digits
		String mobile1 = "9876543210";
		boolean isDigitOnly = true;

		for (int i = 0; i < mobile1.length(); i++) {
		    if (!Character.isDigit(mobile.charAt(i))) {
		        isDigitOnly = false;
		        break;
		    }
		}

		System.out.println(isDigitOnly);
		
		
		//convert first letter to uppercase
		String name = "palak";

		String result = name.substring(0, 1).toUpperCase() + name.substring(1);
		System.out.println(result);
		
		
		//masked email
		String email1 = "user@gmail.com";

		String masked1 = email.charAt(0) + "****" + email.substring(email.indexOf("@"));
		System.out.println(masked1);
		
		
		String s = "Java";

		s.chars().forEach(ch -> System.out.println((char)ch));
		
		
		
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= 5; i++) {
		    sb.append(i).append(" ");
		}

		System.out.println(sb);
		
		
		String input = "Java";
		String reversed = new StringBuilder(input).reverse().toString();

		System.out.println(reversed);


	}

}
