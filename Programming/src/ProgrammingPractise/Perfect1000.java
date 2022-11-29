package ProgrammingPractise;

public class Perfect1000 {
	public static boolean isPerfect(int num)
	{  int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			sum=sum+i;	
		}if(sum==num)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		for(int i=0;i<1000;i++)
		{
			boolean rs=isPerfect(i);
			if(rs==true)
				System.out.println(i);
			
		}

	}

}
