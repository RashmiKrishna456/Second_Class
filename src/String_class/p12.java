package String_class;
//StringBufffer methods
//setCharAr(), delete(), reverse()
public class p12 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		System.out.println(sb);
		sb.setCharAt(0, 'x');
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
