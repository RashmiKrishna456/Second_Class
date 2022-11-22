package object_class;
//clone

public class car implements Cloneable{
	String ModelName, color;
	double price;
	public car(String ModelName, String color, double price)
	{
		this.ModelName=ModelName;
		this.color=color;
		this.price=price;
}
	public String toString()
	{
		return "ModelName="+this.ModelName + " color=" +this.color +" price=" +this.price;
	}
	public static void main(String[] args) {
		car c=new car("Benz", "grey", 90);
		car [] ob=new car[4];
		for(int i=0;i<ob.length;i++)
		{
			try
			{
				ob[i]=(car)c.clone();
			}
			catch(CloneNotSupportedException e)
			{
				
			}
		}
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
		}
	}
