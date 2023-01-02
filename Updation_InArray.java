//WAP to update the element in arrays
package Array_Programming;
import java.util.Arrays;
public class Updation_InArray {
	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		System.out.println("Before Update: "+Arrays.toString(a));
		
		int index=2;
		int element = 17;
		a=update(index, element, a);
		System.out.println(Arrays.toString(a));
		
		
		index=4;
		element=20;
		a=update(index, element, a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] update(int index, int element, int[] a) {
		if(index < 0 || index >=a.length)
		{
			System.out.println("Index Not Found..");
			return a;
		}
		a[index]=element;
		return a;
	}

}
