package checked_exp;
//Propagation of Checked Exception
public class p5 {
	public static void test1() throws ClassNotFoundException
	{
		System.out.println("from test-1 begin");
		test2();
	}
	public static void test2() throws ClassNotFoundException
	{
		System.out.println("from test-2 begin");
		Class.forName("100");
		System.out.println("from test-2 end");
	}
	public static void main(String[] args) {
		System.out.println("from main begin");
		try
		{
			test1(); //Expected exception in test1() method
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("from main end");
	}
}
