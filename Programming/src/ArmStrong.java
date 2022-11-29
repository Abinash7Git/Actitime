
public class ArmStrong {
	
	public static int isCount(int x)
	{
		int count=0;
		do {
			count++;
			x=x/10;
		}while(x!=0);
		return count;
	}
	public static int pow(int n,int p)
	{  
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}return pw;
		
	}	
	public static boolean isArmStrong(int n)
	{
		int sum=0;
		int temp=n;
		int dc=isCount(n);
		do {
			int d=n%10;
			sum=sum+pow(d,dc);
			n=n/10;
		}while(n!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int num=153;
		boolean rs=isArmStrong(num);
		if(rs==true)
			System.out.println("number is Armstrong number");
		else
			System.out.println("number is not a armstrong number");

	}

}
