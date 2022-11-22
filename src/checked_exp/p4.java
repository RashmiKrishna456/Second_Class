package checked_exp;
//Handling checked exception using throws
//We can declare multiple throws separated by comma
public class p4 {
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException{
		System.out.println("from main of p4");
		Class.forName("checked_exp.p1000");
		Thread.sleep(1000);
	}
}
