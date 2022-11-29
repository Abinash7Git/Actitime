package Programming;

public class Factorial {
	public static int checkFact(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}return fact;
	}

	public static void main(String[] args) {
		int num=10;
		for(int i=2;i<num;i++)
		{
			int rs=checkFact(i);
			System.out.println("factorial is "+rs);
		}

	}

}
