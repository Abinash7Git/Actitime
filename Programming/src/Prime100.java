
public class Prime100 {

	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
				System.out.println(i);
		}
	}
		public static boolean isPrime(int num)
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					return false;
			}
					return true;
			
		}

	}


