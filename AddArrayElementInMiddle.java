//WAP to add elements in arrays any index
package Array_Programming;
import java.util.Arrays;
public class AddArrayElementInMiddle {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		a = add(3,9,a);
		System.out.println(Arrays.toString(a));
		a = add(2,17,a);
		System.out.println(Arrays.toString(a));
		a = add(100, 15, a);
		System.out.println(Arrays.toString(a)); 
		a= add(6, 65,a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] add(int index, int element, int[] a) {
		if(index<0 || index>a.length) {
			System.out.println("Index not Found");
			return a;
		}
		int[] b=new int[a.length+1];
		for(int i=0; i<a.length; i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}else {
				b[i+1]=a[i];
			}
			
		}
		b[index]= element;
		return b;
		
	}

}
