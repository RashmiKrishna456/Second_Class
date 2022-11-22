package question_prg;
//to check whether the string is palindrome
public class p6 {
public static void main(String[] args) {
	String s1="madam";
	char[] ch=s1.toCharArray();
	String s2="";
	for(int i=ch.length-1; i>=0;i--)
	{
		s2=s2+ch[i];
	}
	if(s1.equals(s2))
		System.out.println("It's a Palindrome");
	else
		System.out.println("It's not a Palindrome");
}
}
