
public class CountPrime {

	public static void main(String[] args) {
		int num=234156;
		int rs=isCountPrime(num);
		System.out.println("total number of prime number is" + rs);

	}
	public static int isCountPrime(int num)
	{int prime=0;
	int nonprime=0;
		while(num!=0)
		{
			int d=num%10;
			for(int i=2;i<=d/2;i++)
			{
				if(d%i==0)
					nonprime=nonprime+1;
				else
					prime=prime+1;
				num=num/10;
			}
		}return prime;
	}

}
