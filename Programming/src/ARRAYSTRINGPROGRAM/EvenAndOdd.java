package ARRAYSTRINGPROGRAM;

import java.util.Scanner;

public class EvenAndOdd {
	public static int[] countEvenOdd(int ar[])
	{
		int ec=0;
		int oc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}int count[]= {ec,oc};
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<ar.length;i++)
        {
        	ar[i]=sc.nextInt();
        }
        
        int[] rs=countEvenOdd(ar);
        System.out.println("total even number is "+rs[0]);
        System.out.println("total odd number is "+rs[1]);
	}

}
