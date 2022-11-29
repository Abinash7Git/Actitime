package ProgrammingPractise;

public class ArrayPractise6 {
	public static void reverse(int ar[])
	{
	int i=0;
	int j=ar.length-1;
	    while(i<j)
	    {
	    	int temp=ar[i];
	    	   ar[i]=ar[j];
	    	   ar[j]=temp;
	    	   i++;
	    	   j--;
	    }
	}
	public static void main(String[] args) {
		int ar[]= {23,78,43,90,56,32};
		System.out.println("before reverse");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		reverse(ar);
		System.out.println("after reverse");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
