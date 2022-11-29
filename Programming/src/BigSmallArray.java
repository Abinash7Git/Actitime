import java.util.Scanner;

public class BigSmallArray {
	
	public static int isBiggest(int x[])
	{
		int big=x[0];
		for(int i=1;i<x.length;i++)
		{  
			if(x[i]>big)
				big=x[i];	
		}return big;
	}
	public int isSmallest(int y[])
	{
		int small=y[0];
		for(int i=1;i<y.length;i++)
		{
			if(y[i]<small)
				small=y[i];
		}return small; 
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter size for array");
	  int n=sc.nextInt();
	  int ar[]=new int[n];
	  System.out.println("enter the array element");
	  for(int i=0;i<n;i++)
	  {
		  ar[i]=sc.nextInt();
	  }
	  int rs=isBiggest(ar);
	  BigSmallArray xyz=new BigSmallArray();
	  int qs=xyz.isSmallest(ar);
	  System.out.println("biggest element in array is "+rs);
	  System.out.println("smallest element in array is "+qs);

	}

}
