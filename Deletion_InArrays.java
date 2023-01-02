//WAP to delete the element from arrays
package Array_Programming;
import java.util.Arrays;
public class Deletion_InArrays {
	public static void main(String[] args) {
		int[] a= {1,2,5,3,4};
		int index=2;
		System.out.println(Arrays.toString(a));
		a=delete(index,a);
		System.out.println(Arrays.toString(a));
		index=-8;
		a=delete(index,a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] delete(int index, int[] a) {
		
		if(index<0 || index>=a.length)
		{
			System.out.println("Index not found");
			return a;
		}
		int[] b=new int[a.length-1];
		for(int i=0; i<b.length; i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i]=a[i +1];
			}
		}
		return b;
		
	}
	

}
