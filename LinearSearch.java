package Array_Programming;

public class LinearSearch {
public static void main(String[] args) {
	int [] a= {7,6,8,1,5};
	int search=7;
	boolean b=false;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==search)
		{
			System.out.println("The element is present :" + i);
			b=true;
		break;
		}
	}
	if(b==false)
	{
		System.out.println("Not present");
	}
}
	
}
