package ProgrammingPractise;

public class Janu2 {
	public static int isSum(int num)
	{
		int sumdigit=0;
		for(int i=0;i<=num;i++)
		{
			sumdigit=sumdigit+i;
		}
		return sumdigit;
	}
	public static void main(String[] args) {
		int num=100;
		int sum=isSum(num);
		System.out.println("Sum of natural number is "+sum);

	}

}
