package ARRAYSTRINGPROGRAM;

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
		int ar[]= {12,45,23,78,37};
	     for(int i=0;i<ar.length;i++)
	     {
	    	boolean rs=isPrime(ar[i]);
	    	if(rs==true)
	    		System.out.println(ar[i]+" number is prime");
	    	else
	    		System.out.println((ar[i]+" number is not prime "));
	     }
		
		
	}	
}
