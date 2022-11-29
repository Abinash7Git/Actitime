
public class Average {
	
	public static int isAverage(int num)
	{
		int count=0;
		int sum=0;
		do {
			count++;
			sum=sum+num%10;
			num=num/10;
		}
		while(num!=0);
		
		return (sum/count);
	}
	
	

	public static void main(String[] args) {
		int num=453265;
		int avg=isAverage(num);
		System.out.println("average of number is "+avg);

	}

}
