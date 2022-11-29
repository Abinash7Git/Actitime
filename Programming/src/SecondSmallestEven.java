import java.util.Arrays;

public class SecondSmallestEven {
	public static int secondSmallestEven(int ar[])
	{  int count=0;
	int num=0;
		Arrays.sort(ar);
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]%2==0) {
				count++;
			if(count==2) {
				num=ar[i];
			}}
		}return num;
	}
	
	
	

	public static void main(String[] args) {
		int ar[]= {10,54,31,91,16,37,34};
		int rs=secondSmallestEven(ar);
		System.out.println("second highest even number is "+rs);

	}

}
