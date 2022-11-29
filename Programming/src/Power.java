
public class Power {

	public static void main(String[] args) {
		int p=3;
		int n=4;
		int p1=isPower(p,n);
		System.out.println("power of this number is " +p1);

	}
	public static int isPower(int p,int n)
	{
		int pw=1;
		while(n>0)
		{
			pw=pw*p;
			n--;
		}
		return pw;
	}

}
