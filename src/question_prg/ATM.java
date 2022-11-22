package question_prg;
//ATM pin prg to explicitly raising exception when pin is wrong by using checked exception 
import java.util.Scanner;

public class ATM {
	static float mpin=1996;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		int apin=sc.nextInt();
		if(mpin==apin)
		{
			System.out.println("transaction continues");
		}
		else
		{
			System.out.println("transaction declined");
			throw new NumberFormatException();
		}
	}
}
