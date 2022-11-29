package ProgrammingPractise;

public class Janu1 {
	public static int sumDigit(int num)
	{   int sumdigit=0;
		do {
			int d=num%10;
			sumdigit=sumdigit+d;
			num=num/10;
			}while(num!=0);
		return sumdigit;
	}

	public static void main(String[] args) {
		int num=4567;
		int sum=sumDigit(num);
		System.out.println("Sum of digit "+sum);

	}

}
