//wap to take input from the user by suing array

package Array_Programming;
import java.util.Scanner;
public class TakeInputByArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter The Elements of the array");
			a[i] = sc.nextInt();
		}
		System.out.println("==========Displaying the array elements");
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}