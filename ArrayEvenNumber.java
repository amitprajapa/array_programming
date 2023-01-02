package Array_Programming;

public class ArrayEvenNumber {
	public static void main(String[] args) {
		int[] a= {2, 8, 3, 4, 5,6};
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 ==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
