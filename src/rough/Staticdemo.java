package rough;

public class Staticdemo {
	
	
	static
	{
		System.out.println("Hello I am static block");
	}
	static String name ="Static Variable";
	static void add(int a, int b)
	{
		int result = a+b;
		System.out.println("Addition: " + result+ "name"+name);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Staticdemo.add(10,20);
        System.out.println("hello main");
	}

}
