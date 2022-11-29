package Programming;

import java.util.Scanner;

public class JanuArray {
	public static void replaceeSum(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			int sum=0;
			while(x[i]!=0)
			{
				sum=sum+x[i]%10;
				x[i]=x[i]/10;
			}
			x[i]=sum;
		
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		replaceeSum(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
