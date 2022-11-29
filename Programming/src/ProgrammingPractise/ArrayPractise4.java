package ProgrammingPractise;

public class ArrayPractise4 {
	public static boolean checkPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}return true;
	}
	public static int isPrime(int ar[])
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean rs=checkPrime(ar[i]);
			if(rs==true)
				count++;
		}return count;
	}

	public static void main(String[] args) {
		int ar[]= {12,21,23,37,87,33};
		int count=isPrime(ar);
		System.out.println("total number of prime number is "+count);

	}

}
