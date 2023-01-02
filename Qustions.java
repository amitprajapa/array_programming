//wap to print total decrement operation to make 
//the elements of the array divisible by an integer
package Array_Programming;

public class Qustions {
	public static void main(String[] args) {
		
	
	int[] a= {5,9,12,16,25};
	int k=6;
	int sum=0;
    for(int i=0; i<a.length; i++)
    {
    	int b=a[i] % k;
    	sum=sum+b;
    }
    System.out.println(sum);

}
}