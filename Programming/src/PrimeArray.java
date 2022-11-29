import java.util.Scanner;

public class PrimeArray {
	public static boolean isPrime1(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}return true;
	}
	
	public static int isPrime(int x[])
	{  int count=0;
		for(int i=0;i<x.length;i++)
		{
			boolean rs=isPrime1(x[i]);
		    if(rs==true)
			count++;
		}return count;
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enetr the array element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int prime=isPrime(ar);
		System.out.println("total number of prime number is "+ prime );

	}

}
