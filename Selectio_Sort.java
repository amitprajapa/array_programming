package Array_Programming;

public class Selectio_Sort {
	public static void main(String[] args) {
		int[] a= {3,5,4,2,1};
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			int min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0; i<a.length; i++) 
		{
		System.out.print(a[i]+" ");
		}
		
	}

}

