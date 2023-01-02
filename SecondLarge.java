package Array_Programming;
public class SecondLarge {
	public static void main(String[] args) {
		int[] a= {14,3,1,5,2,14,5};
		int large=Integer.MIN_VALUE;
		int slarge=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>large)
			{
				slarge=large;
				large=a[i];
			}else if(a[i] > slarge && a[i]!=large)
			{
				slarge=a[i];
			}
			
		}
		System.out.println(large);
		System.out.println(slarge);
	}

}
