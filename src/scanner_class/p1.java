package scanner_class;

import java.util.Scanner;

public class p1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the integer data");
	int a=sc.nextInt();
	System.out.println("enter the float data");
	float b = sc.nextFloat();
	System.out.println("enter the double data");
	double c = sc.nextDouble();
	System.out.println("enter the string data");
	String d = sc.next();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
}
