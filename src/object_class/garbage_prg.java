package object_class;
//finalize()
public class garbage_prg {
	int a=100, b=200; 
	protected void finalize() throws Throwable
	{
		System.out.println("I want to bcecome CM");
	}
	public static void main(String[] args) {
		garbage_prg ob1=new garbage_prg();
		ob1=new garbage_prg();
		garbage_prg ob2=new garbage_prg();
		ob2=null;
	}
}
