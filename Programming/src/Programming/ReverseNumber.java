package Programming;

public class ReverseNumber {
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
		int num=345;
		int rs=isReverse(num);
		System.out.println("After reverse "+rs);

	}

}
