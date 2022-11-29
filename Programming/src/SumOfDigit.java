
public class SumOfDigit {

	public static void main(String[] args) {
		int num=3456789;
		int rs=isAdd(num);
		System.out.println("addtion of digit is " +rs);
	}
	public static int isAdd(int num)
	{
		int sum=0;
		while(num>0)
		{   int d=num%10;
			sum=sum+d;
			num=num/10;
		}return sum;
		
	}
	  

}
