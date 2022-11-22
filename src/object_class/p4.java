package object_class;
//clone()
public class p4 implements Cloneable{
	int a=100, b=200;
	public static void main(String[] args) throws CloneNotSupportedException {
		p4 ob=new p4();
		p4 ob1=(p4)ob.clone();
		p4 ob2=(p4)ob.clone();
		p4 ob3=(p4)ob.clone();
		System.out.println(ob.a+","+ob.b);
		System.out.println(ob1.a+","+ob1.b);
		System.out.println(ob2.a+","+ob2.b);
		System.out.println(ob3.a+","+ob3.b);
	}

}
