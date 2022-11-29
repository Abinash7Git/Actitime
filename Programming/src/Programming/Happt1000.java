package Programming;

public class Happt1000 {
	public static boolean isHappy(int num1)
	{  
		
		while(num1>9)
		{
			int sum=0;
		do {
			int d=num1%10;
			sum=sum+d*d;
			num1=num1/10;
		}while(num1!=0);
		num1=sum;
		}if(num1==1||num1==7)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num=100;
		for(int i=1;i<=num;i++)
		{
			boolean rs=isHappy(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
