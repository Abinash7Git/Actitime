package ProgrammingPractise;

public class Janu5 {
	public static int isReverse(int num)
	{
		int rev=0;
		do {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}while(num!=0);
		return rev;
	}
	public static void main(String[] args) {
		int num=3245674;
		int rev=isReverse(num);
        System.out.println("Reverse of a number is "+rev);
	}

}
