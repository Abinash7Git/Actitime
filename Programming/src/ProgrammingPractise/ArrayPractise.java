package ProgrammingPractise;

import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("taking array element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("printing the array element");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
