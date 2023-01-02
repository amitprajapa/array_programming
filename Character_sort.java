package Array_Programming;

public class Character_sort {
	public static void main(String[] args) {
		char[] a= {'p','r','a','d','e','e','p'};
		for(int i=0; i<a.length; i++)
		{
			int min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
			{
				min=j;
			}
		}
		char temp =a[i];
		a[i]=a[min];
		a[min]=temp;
	}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

}
}
