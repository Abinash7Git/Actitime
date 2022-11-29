package ProgrammingPractise;

public class Strong1000 {
	public static int isFact(int d)
	{
		int fact=1;
		while(d>0)
		{
			fact=fact*d;
			d--;
		}return fact;
	}
	public static boolean isStrong(int num)
	{   int sum=0;
	int temp=num;
		do {
			int d=num%10;
			sum=sum+isFact(d);
			num=num/10;
		}while(num!=0);
		if (sum==temp)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		for (int i=1;i<1000;i++)
		{
			boolean rs=isStrong(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
