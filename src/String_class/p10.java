package String_class;
//StringBufffer methods
//append the data into String Buffer object
public class p10 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("java");
	System.out.println(sb);
	sb.append(true);
	sb.append('$');
	sb.append(100);
	System.out.println(sb);
}
}
