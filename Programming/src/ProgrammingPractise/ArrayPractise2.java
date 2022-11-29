package ProgrammingPractise;

import java.util.Scanner;

public class ArrayPractise2 {
	public static int isSmall(int ar[])
	{
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
				small=ar[i];
		}return small;
	}
	public static int isBig(int ar[])
	{
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}return big;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the array element ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int big=isBig(ar);
		int small=isSmall(ar);
		System.out.println("Biggest number among array element is "+big);
		System.out.println("Smallest number among array element is "+small);

	}

}
