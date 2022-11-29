
public class HappyNumber {
	
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
		}if(num==1||num==7)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int num=49;
		boolean rs=isHappy(num);
		if(rs==true)
			System.out.println("number is happy number");
		else
		System.out.println("number is not a happy number");

	}

}
