package String_class;
//StringBufffer methods
//insert()
public class p11 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb);
		sb.insert(0, '$');
		System.out.println(sb);
		sb.insert(2, 25.5f);
		System.out.println(sb);
	}
}
