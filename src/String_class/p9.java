package String_class;
//COmparing string object by using equals()
//only contents will be compared
//equalsIgnoreCase(), equals(), contentEquals()
public class p9 {
public static void main(String[] args) {
	String s1=new String("java");
	String s2=new String("java");
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.contentEquals(s2));
}
}
