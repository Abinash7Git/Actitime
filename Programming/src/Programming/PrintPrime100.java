package Programming;

public class PrintPrime100 {
	public static boolean isPrime(int num1)
	{
		for(int i=2;i<num1/2;i++)
		{
			if(num1%i==0)
				return false;
		}return true;
	}

	public static void main(String[] args) {
		int num=100;
		for(int i=1;i<num;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
