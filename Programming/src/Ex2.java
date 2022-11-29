import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int a[]= {20,30,40,50};
			System.out.println("Enter the index");
			int i=sc.nextInt();
			System.out.println("Enter the number");
			int n=sc.nextInt();
			try {
				int b=a[i]/n;
				System.out.println(b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Handle using AE catch block");
			}
			catch(ArrayIndexOutOfBoundsException s)
			{
				System.out.println("Handle using AIOOBE catch block");
			}
			catch(StringIndexOutOfBoundsException j)
			{
				System.out.println("Handle using AIOOBE catch block1");
			}
			
			
	}

}
