
public class PrintPrime {
	
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			return false;
			
		}return true;
		
	}
	public static void main(String[] args) {
		int num=100;
		for(int i=1;i<=num;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				System.out.println(i);
		}
		

	}

}
