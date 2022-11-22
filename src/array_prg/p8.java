package array_prg;
//handling unchecked exception using multiple try catch block, the order of execution should be from child class to parent class
//java.lang.NumberFormatException: For input string: "abc123"
public class p8 {
	public static void main(String[] args) {
		String s = "abc123";
		try
		{
			int n=Integer.parseInt(s);  //Expected NumberFormatException
			System.out.println(n);
		}
		catch(StringIndexOutOfBoundsException e) //child
		{		
			System.out.println("from catch -1");
			System.out.println(e);
		}
		catch(Exception e) //parent 
		{
			System.out.println("from catch-2");
			System.out.println(e);
		}
		catch(Throwable e) //parent of Exception
		{
			System.out.println("from catch-2");
			System.out.println(e);
		}
		}
	}
