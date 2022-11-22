package checked_exp;
//Handling checked exception using try catch block
public class p2 {
	static
	{
		System.out.println("from static block of p2");
	}
	public static void main(String[] args) {
		System.out.println("from main of p2");
		try
		{
			Class.forName("checked_exp.p1");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
