package array_prg;

public class car {
	String ModelName, color;
	double price;
	public car(String ModelName, String color, double price)
	{
		this.ModelName=ModelName;
		this.color=color;
		this.price=price;
}
	public void DisplayInfo()
	{
		System.out.println("ModelName="+this.ModelName + " color=" +this.color +" price=" +this.price);
	}
	public static void main(String[] args) {
		car c1=new car("Benz", "grey", 90);
		car c2=new car("Audi", "white", 80);
		car c3=new car("Chevrolet", "black", 70);
		car[] ob= {c1,c2,c3};
		for(int i=0;i<ob.length;i++)
		{
			ob[i].DisplayInfo();
		}
	}
}
