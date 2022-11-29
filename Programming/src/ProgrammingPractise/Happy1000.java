package ProgrammingPractise;

public class Happy1000 {
	public static boolean isHappy(int num)
	{
		while(num>9)
		{
			int sum=0;
			do {
				int d=num%10;
				sum=sum+d*d;
				num=num/10;
			}while(num!=0);
			num=sum;
		}
			if(num==1||num==7)
				return true;
			else
				return false;
			}

	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
			boolean rs=isHappy(i);
			if(rs==true)
			System.out.println(i);
		}

	}

}
