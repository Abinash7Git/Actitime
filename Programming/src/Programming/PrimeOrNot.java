package Programming;

public class PrimeOrNot {
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				return false;
			
		}return true;
	}

	public static void main(String[] args) {
		int num=11;
		boolean rs=isPrime(num);
		if(rs==true)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not a prime");

	}

}
