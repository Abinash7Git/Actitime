import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter all the array element");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("print the array element firse to last");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+ " ");
		}
		System.out.println("print the array element from last to last");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]+ " ");
		}

	}

}
