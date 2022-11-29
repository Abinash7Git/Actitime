package ProgrammingPractise;

public class Armstrong1000 {
	public static int isCount(int num1)
	{    int count=0;
		do {
			count++;
			int d=num1%10;
			num1=num1/10;
		}while(num1!=0);
		return count;
	}
	public static int pow(int n,int p)
	{
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
			p--;
		}return pow;
		
	}
	public static boolean isArmstrong(int num)
	{     
		int sum=0;
		int temp=num;
		int dc=isCount(num);
		do {
			int d=num%10;
			sum=sum+pow(d,dc);
			num=num/10;
		}while(num!=0);
		if(sum==temp)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
			boolean rs=isArmstrong(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
