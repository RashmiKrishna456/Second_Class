package checked_exp;
//Handling checked exception using throws
public class p3 {
	static
	{
		System.out.println("from static block of p3");
	}
	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("from main of p3");
		Class.forName("checked_exp.p1000");
	}
}
