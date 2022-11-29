package ProgrammingPractise;

public class Janu3 {
	public static boolean isPerfect(int num)
	{
		int sum=0;
		//int temp=num;
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
		int num=28;
		boolean check=isPerfect(num);
		if(check==true)
			System.out.println("Number is perfect number");
		else
			System.out.println("Number is not perfect number");

	}

}
