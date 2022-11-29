package ProgrammingPractise;

public class ArrayPractise7 {
	public static void isReplace(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			int sum=1;
		while(ar[i]!=0)
		{
			sum=sum*(ar[i]%10);
			ar[i]=ar[i]/10;
		} ar[i]=sum;
		}	
	}
	public static void main(String[] args) {
		int ar[]= {23,45,67,34,99,89};
		isReplace(ar);
		System.out.println("After replace");
         for(int i=0;i<ar.length;i++)
         {
        	 System.out.println(ar[i]);
         }
	}

}
