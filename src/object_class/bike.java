package object_class;
//equals()
//equals() method of object class can be overridden to compare the contents instead f comparing reference
public class bike {
int cc;
double mileage;
public bike(int cc, double mileage)
{
this.cc=cc;
this.mileage=mileage;
}
public boolean equals(bike obj)
{
bike temp=(bike) obj;
if(this.cc==this.cc && this.mileage==this.mileage)
	return true;
else
	return false;
}
public static void main(String[] args) {
	bike pulsar=new bike(150, 45);
	bike apache=new bike(150, 45);
	System.out.println(pulsar.equals(apache));
}
}
