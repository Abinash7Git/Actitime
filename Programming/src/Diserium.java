
public class Diserium {
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
		int fact=1;
		while(p>0)
		{
			fact=fact*n;
			p--;
		}return fact;
	}
	public static boolean isDiserium(int n)
	{
		int sum=0;
		int temp=n;
		int dc=isCount(n);
		do {
			int d=n%10;
			sum=sum+pow(d,dc);
			dc--;
			n=n/10;
		}while(n!=0);
		if(sum==temp)
			return true;
		else
			return false;
	}
	   public static void main(String[] args) {
		int num=175;
		boolean rs=isDiserium(num);
		if(rs==true)
			System.out.println("number is diserium");
		else
			System.out.println("number is not a diserium number");

	}

}
