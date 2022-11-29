
public class ReverseNumber {

	public static void main(String[] args) {
		int num=345231;
		int rs=isReverse(num);
		System.out.println("reverse of this number is " +rs);

	}
	public static int isReverse(int num) 
		{
			int rev=0;
			while(num>0)
			{
				int d=num%10;
				rev=rev*10+d;
				num=num/10;
			}return rev;
		
		}
	}
	


