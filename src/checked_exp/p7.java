package checked_exp;
//finally block with try block
public class p7 {

public static void main(String[] args) {
	try {
		int a=10/0;
	}
	finally
	{
		System.out.println("finally block");
	}
}
}
