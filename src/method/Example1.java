package method;

public class Example1 {

	public static void test1()
	{
		System.out.println("my name is tejas");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Running main method");
		test2();
		test1();
		System.out.println("Ending main method");
	}

	public static void test2()
	{
		System.out.println("This is static regular test2 method");
		System.out.println("exit");
	}
	
}
