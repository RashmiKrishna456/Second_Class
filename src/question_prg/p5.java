package question_prg;
//to reverse the string
public class p5 {
public static void main(String[] args) {
	String s1="Rashmi";
	char[] ch=s1.toCharArray();
	String s2="";
	for(int i=ch.length-1; i>=0;i--)
	{
		s2=s2+ch[i];
	}
	System.out.println(s1);
	System.out.println(s2);
}
}
