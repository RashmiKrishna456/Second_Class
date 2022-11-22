package object_class;
//toString()
public class p1 {
	int a=100;
	int b=200;
	public static void main(String[] args) {
		p1 ob1=new p1();
		System.out.println(ob1); //returns the reference, object_class.p1@15db9742
		System.out.println(ob1.toString()); //returns the reference
		System.out.println("____________");
		p1 ob2 =new p1();
		System.out.println(ob2); //returns the reference
		System.out.println(ob2.toString());////returns the reference
	}
}
