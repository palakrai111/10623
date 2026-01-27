package corejava;

public class Exceptiondemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Start of the program");
		int a = 10;
		int b =0;
		try {
			String s = null;
			int len = s.length();
			System.out.println("Length: " + len);
			
			
			int c = a/b;
		
		
		System.out.println("Result: " + c);
		System.out.println("End of the program");
		
	}
		
		
		catch (ArithmeticException e) {
		//System.out.println("Exception caught: " + e.getMessage());
		e.printStackTrace();
	} catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("Exception caught: " + e.getMessage());
		e.printStackTrace();
	}
		catch(Exception e)
		{
		   e.printStackTrace();
		} finally {
			System.out.println("I am always executed");
		}
	System.out.println("Program ended");
	}

}
