package Programming;

public class Armstrong1000 {
	public static int digitCount(int num1)
	{ 
		int count=0;
		do {
			count++;
			num1=num1/10;
			
		}while(num1!=0);
		return count;
	}
	public static int pow(int d,int dc)
	{
		int pow=1;
		while(dc>0)
		{
			pow=pow*d;
			dc--;
		}return pow;
	}
	public static boolean checkArmstrog(int num1)
	{
		int dc=digitCount(num1);
		int temp=num1;
		int sum=0;
		do {
			int d=num1%10;
			sum=sum+pow(d,dc);
			num1=num1/10;
		}while(num1!=0);
		if(temp==sum)
			return true;
		else 
			return false;
		}
	public static void main(String[] args) {
		int num=1000;
		for(int i=1;i<=num;i++)
		{
			boolean rs=checkArmstrog(i);
			if(rs==true)
				System.out.println(i);
		}
	}

}
