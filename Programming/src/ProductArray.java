import java.util.Scanner;

public class ProductArray {
	public static int productArray(int x[])
	{
		int product=1;
		for(int i=0;i<x.length;i++)
		{
			product=product*x[i];
		}return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enetr the array element");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int product=productArray(ar);
		System.out.println("product of array element is "+product);
		
		
	}

}
