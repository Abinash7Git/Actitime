package Programming;

public class Average {

	public static void main(String[] args) {
		int num=2345;
		int count=0;
		int sum=0;
		do {
			int d=num%10;
			count++;
			sum=sum+d;
			num=num/10;
		}while(num!=0);
		System.out.println(sum/count);

	}

}
