package question_prg;

import java.util.Arrays;

//To reverse an array
public class p3 {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b=new int[a.length];
		for(int i=0, j=a.length-1;i<a.length;i++,j--)
		{
			b[i]=a[j];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
