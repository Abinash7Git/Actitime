
public class PrintAverage {
	public static int isAverage(int n)
	{
		int count=0;
		int sum=0;
		do {
			int d=n%10;
			count++;
			sum=sum+d;
			n=n/10;
		}while(n>0);
			return sum/count;
	}

	public static void main(String[] args) {
		int num=15465155;
		int rs=isAverage(num);
		System.out.println("Average of that number is "+rs);

	}

}
