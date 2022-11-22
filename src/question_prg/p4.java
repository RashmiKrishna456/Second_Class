package question_prg;
//To sort the array in ascending order
import java.util.Arrays;

public class p4 {
	public static void main(String[] args) {
		int[] a= {25,15,5,10,20};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
		}
		}
		System.out.println(Arrays.toString(a));
}
}
