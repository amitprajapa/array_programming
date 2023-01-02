package Array_Programming;

public class Largest_ElementInArray2 {
	public static void main(String[] args) {
		int[] a= {4,3,1,5,2};
		
		int large=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(large);
		
	}
	
	

}
