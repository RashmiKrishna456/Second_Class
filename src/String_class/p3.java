package String_class;
//Methods of String class
//toCharArray(), charAt(), length()
public class p3 {
	public static void main(String[] args) {
		String s="Aashika";
		char[] ch=s.toCharArray(); //
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("_________________");
		System.out.println(s.charAt(3)); //
		System.out.println(s.charAt(5)); //
		System.out.println("_________________");
		System.out.println(s.length()); //
	}
}
