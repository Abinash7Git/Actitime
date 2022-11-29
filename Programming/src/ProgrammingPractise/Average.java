package ProgrammingPractise;

public class Average {
	public static int isAverage(int num)
	{
		int sum=0;
		int count=0;
		do {
			count++;
			int d=num%10;
			sum=sum+d;
			num=num/10;
		}while(num!=0);
		return sum/count;
	}

	public static void main(String[] args) {
		int num=7345788;
		int avg=isAverage(num);
		System.out.println("Average of the number is "+avg);

	}

}
