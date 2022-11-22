package object_class;

public class pen {
	String name, color;
	double price;
	public pen(String name, String color, double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public String toString()
	{
		return "name=" +this.name+ " color=" +this.color+ " price=" +this.price;
	}
	public static void main(String[] args) {
		pen p1=new pen("cello", "black", 10);
		pen p2=new pen("parker", "blue", 15);
		pen p3=new pen("reynolds", "red", 20);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
