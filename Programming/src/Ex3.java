import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
					String s="Qspider";
					String k=null;
					try {
					System.out.println("Enter the index");
					int i=sc.nextInt();
					System.out.println(s.charAt(i));
					System.out.println("hello");
					}
					catch(ArithmeticException e)
					{
						System.out.println("Handle using AE catch block");
					}
					catch(NullPointerException e)
					{
						System.out.println("Handle using null catch block");
					}
					catch(StringIndexOutOfBoundsException j)
					{
						System.out.println("Handle using AIOOBE catch block");
					}
					
					
			}


}
