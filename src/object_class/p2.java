package object_class;
//overriding toString() by using 
public class p2 {
	int x=100, y=200;
	public String toString()
	{
		return this.x+","+this.y;
	}
public static void main(String[] args) {
	p2 ob1=new p2();
	p2 ob2=new p2();
	System.out.println(ob1);
	System.out.println(ob2);
}
}
