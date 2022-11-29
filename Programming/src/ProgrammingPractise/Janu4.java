package ProgrammingPractise;

public class Janu4 {
	public static int isProduct(int num)
	{  int mul=1;
		do {
			int d=num%10;
			mul=mul*d;
			num=num/10;	
		}while(num!=0);
		return mul;
	}
	public static void main(String[] args) {
		int num=32456;
		int product=isProduct(num);
		System.out.println("Product of a number is "+product);

	}

}
