
public class CheckPallindrum {

	public static void main(String[] args) {
		int num=399308;
		boolean rs=isPallindrum(num);
		if(rs==true)
			System.out.println("number is pallindrum");
		else
			System.out.println("number is not pallindrum");

	}
	public static boolean isPallindrum(int num)
	{    int rev=0; 
	int temp=num;
		while(num>0) 
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
			
		}if(rev==temp)
			return true;
		else
			return false;
	}

}
