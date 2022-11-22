package array_prg;
//handling unchecked exception using try catch block
//java.lang.NumberFormatException
public class p6 {
	public static void main(String[] args) {
		System.out.println("main begin");
		String s = "abc123";
		try
		{
			int n=Integer.parseInt(s);  //Expected NumberFormatException
			System.out.println(n);
		}
		catch(Throwable e) //Throwable prints the name of the exception
		{
			System.out.println("from catch");
			System.out.println(e);
		}
		System.out.println("main end");
	}
}
