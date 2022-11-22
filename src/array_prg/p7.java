package array_prg;
//handling unchecked exception using multiple try catch block
//java.lang.StringIndexOutOfBoundsException: String index out of range: 100
public class p7 {
	public static void main(String[] args) {
		System.out.println("main begin");
		String s = "java";
		try
		{
			s.charAt(100); //Expected StringIndexOutOfBoundsException here
		}
		catch(ArithmeticException e)
		{
			System.out.println("from catch-1");
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("from catch-2");
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) //Even if it is multiple catch block, it will select the correct one
		{
			System.out.println("from catch-1");
			System.out.println(e);
		}
		System.out.println("main end");
	}
}
