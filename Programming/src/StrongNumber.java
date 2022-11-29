
public class StrongNumber {
	
	public static int isFact(int x)
	{
		int fact=1;
		while(x>1)
		{
			fact=fact*x;
			x--;
		}return fact;
	}
	public static boolean isStrong(int num)
	{
		int sum=0;
		int temp=num;
		do {
			int d=num%10;
			sum=sum+isFact(d);
			num=num/10;
		}while(num!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int num=145;
		boolean rs=isStrong(num);
		if(rs==true)
			System.out.println("number is Strong number");
		else
		System.out.println("number is not Strog number");

	}

}
