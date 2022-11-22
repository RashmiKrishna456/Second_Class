package object_class;
//equals()
public class p3 {
	int a=100, b=200;
	public static void main(String[] args) {
		p3 ob1=new p3();
		p3 ob2=new p3();
		p3 ob3=ob1;
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
	}
}
