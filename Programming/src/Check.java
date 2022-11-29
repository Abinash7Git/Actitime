import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the age");
		int num=sc.nextInt();
		try {
			test(num);
		}
		catch(NumberException e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Done");
	}
	public static void test(int n)
	{
		Scanner sc=new Scanner(System.in);
		if(n>120)
		{
			throw new NumberException ("Invalid");
		}
		else {
			System.out.println("Enter your district name");
			String dist=sc.next();
		}

	}

}
    class NumberException extends RuntimeException
    {
    	NumberException (String s)
    	{
    		super (s);
    	}
    }