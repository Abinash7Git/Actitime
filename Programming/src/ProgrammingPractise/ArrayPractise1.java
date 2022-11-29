package ProgrammingPractise;

import java.util.Scanner;

public class ArrayPractise1 {
	public static int isSum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int sm=isSum(ar);
		System.out.println("Sum of array element is "+sm);

	}

}
