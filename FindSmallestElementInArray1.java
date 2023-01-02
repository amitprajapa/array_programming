package Array_Programming;

public class FindSmallestElementInArray1 {
	public static void main(String[] args) {
		int[] a= {4,3,1,5,2,};
		int small=Integer.MAX_VALUE;
         System.out.println(small);
		for(int i=0; i<a.length;i++)
		{
			if(a[i]<small) 
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}

}

