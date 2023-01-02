package Array_Programming;
import java.util.Arrays;
import java.util.Scanner;
public class CRUD_Operation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter The Elements of the array");
			a[i] = sc.nextInt();
		}
		System.out.println("==========Your entred array=========");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nPress 1 for deletion");
		System.out.println("\nPress 2 for updation");
		System.out.println("\nPress 3 for Insertion");
	
		int z=sc.nextInt();
		switch(z)
		{
		case 1:
		System.out.println("Enter index which you want to delete");
		Scanner sc1=new Scanner(System.in);
		int d=sc1.nextInt();
		a=delete(d, a);
		System.out.println(Arrays.toString(a));
		break;
		
		case 2:
			System.out.println("Enter index which you want to update");
			Scanner sc2=new Scanner(System.in);
			int u=sc2.nextInt();
			System.out.println("Enter Element");
			int element=sc2.nextInt();
			a=update(u, element, a);
			System.out.println(Arrays.toString(a));
		break;
		
		case 3: 
			System.out.println("Enter index where you want to Insert");
			Scanner sc3=new Scanner(System.in);
			int index1=sc3.nextInt();
			System.out.println("Enter Element");
			int element2=sc3.nextInt();
			a=add(index1, element2, a);
			System.out.println(Arrays.toString(a));
			break;
     	}
	}
	
public static int[] delete(int index, int[] a) {
		
		if(index<0 || index>=a.length)
		{
			System.out.println("Index not found");
			return a;
		}
		int[] b=new int[a.length-1];
		for(int i=0; i<b.length; i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i]=a[i +1];
			}
		}
		return b;
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