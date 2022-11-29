import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int ar[ ]=new int [n];
		System.out.println("enter "+n+" values");
		for (int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("printing");
		try {
			System.out.println("level5");
			System.out.println(ar[5]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("print");
			
		}
		finally{
		System.out.println("java");
		System.out.println("main ends");
	}}

}
