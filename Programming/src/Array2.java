import java.util.Scanner;

public class Array2 {
	public static int isSumArray(int x[])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}return sum;
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
		int rs=isSumArray(ar);
		System.out.println("sumof array element is "+rs);

	}

}
