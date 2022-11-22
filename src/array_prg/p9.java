package array_prg;
//Propagation of unchecked Exception
//java.lang.ArithmeticException: / by zero
public class p9 {
	public static void test1()
	{
		System.out.println("from test-1 begin");
		test2();
	}
	public static void test2()
	{
		System.out.println("from test-2 begin");
		int a=10/0;
		System.out.println("from test-2 end");
	}
	public static void main(String[] args) {
		System.out.println("from main begin");
		try
		{
			test1(); //Expected execption in test1() method
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("from main end");
	}
}
