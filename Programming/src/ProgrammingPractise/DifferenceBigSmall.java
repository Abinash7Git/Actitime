package ProgrammingPractise;

public class DifferenceBigSmall {
	public static int diffBigSmall(int num)
	{
		int big=num%10;
		int small=num%10;
		do {
			int d=num%10;
			if(d>big)
				big=d;
			if(d<small)
				small=d;
			num=num/10;
		}while(num!=0);
		return big-small;
	}

	public static void main(String[] args) {
		int num=985643;
		int rs=diffBigSmall(num);
		System.out.println("Difference between big and small is "+rs);
	}

}
