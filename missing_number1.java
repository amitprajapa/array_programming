package Array_Programming;
//wap to find the missing number in a array
//range
//sorted or not 
public class missing_number1 {
	public static void main(String[] args) {
		int[] a= {1,2,4,5};
		int sum1=0;
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of all the element : "+sum1);
		int sum2=0;
		for(int i=1; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of all the element : "+sum2);
		int missing=sum2-sum1;
		System.out.println("Missing Number is : "+missing);
	}
	

}
