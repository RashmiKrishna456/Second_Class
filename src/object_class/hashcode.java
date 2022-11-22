package object_class;

public class hashcode {
	int eid;
	String ename;
	double sal;
	public hashcode(int eid, String ename, double sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
	}
	public static void main(String[] args) {
		hashcode e1=new hashcode(111, "Pooja", 12);
		hashcode e2=new hashcode(112, "Rashmi", 13);
		hashcode e3=new hashcode(113, "Ramya", 14);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
