package Array_Programming;

import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		
		int index=2;
		
		a=update(2,a);
		System.out.println(Arrays.toString(a));
		a=update(1,a);
		System.out.println(Arrays.toString(a));
		
	}
	public static int[] update(int index,int []a) 
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("Index Not Found...");
			return a;
		}
		int[] b=new int[a.length-1];
		for(int i=0; i<b.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}else
			{
				b[i]=a[i+1];
			}
		}
		return b;
	
	}

}
