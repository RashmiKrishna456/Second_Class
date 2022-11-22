package array_prg;
//handling unchecked exception using try catch block
public class p5 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int a=10, b=0;
		try
		{
			System.out.println("from try-1");
			int c=a/b;  //Expected exception here
			System.out.println(c); //skipped from the execution
			System.out.println("from try-2"); //skipped from the execution
		}
		catch(ArithmeticException e)
		{
			System.out.println("from catch");
		}
		System.out.println("main end");
	}
}
