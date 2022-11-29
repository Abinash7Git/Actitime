package ProgrammingPractise;

public class ArrayBigSmall {
	
	public static int isBig(int ar[])
	{
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
			{
				big=ar[i];
			}
		}
			return big;
			}
	public static  int isSmall(int ar[])
	{
		int small=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		return small;
	}
	public static void main(String[] args) {
		int arr[]= {20,59,34,89,9};
		int big=isBig(arr);
		int small=isSmall(arr);
		System.out.println("biggest Element in the array is "+big);
		System.out.println("smallest Element in the array is "+small);

	}

}
