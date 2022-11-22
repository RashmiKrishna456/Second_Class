package question_prg;
//TO find the sum of all the elements in the array
public class p1 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
