package ProgrammingPractise;

public class HowManyPrime {
	public static boolean checkPrime (int num1)
	{
		for(int i=2;i<num1;i++)
		{
			if(num1%i==0)
			return false;
		}
				return true;
		
	}
	public static int isPrime(int num)
	{
		int count=0;
		do {
			int d=num%10;
			boolean rs=checkPrime(d);
			if(rs==true)
				count++;
			num=num/10;

		}while(num!=0);
		return count;
	}

	public static void main(String[] args) {
		int num=4735;
		int count=isPrime(num);
		System.out.println("total number of prime is "+count);
		

	}

}
