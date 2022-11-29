
public class Factorial {

	public static void main(String[] args) {
	 int num=5;
	 int fact=isFact(num);
	 System.out.println("factorial of this number is " +fact);

	}
	public static int isFact(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}

}
