package Array_Programming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElelementAtFirstIndex {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		a=add(9,a);
		System.out.println(Arrays.toString(a));
		a=add(13,a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] add(int element, int[] a)
	{
		int[] b=new int[a.length+1];
		b[0]=element;
		for(int i=0; i<a.length; i++)
		{
			b[i+1]=a[i];
		}
		
		return b;
	}

}
