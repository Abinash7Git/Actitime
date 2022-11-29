package ProgrammingPractise;

public class Pallindrum1000 {
	public static boolean isPallindrum(int num)
	{
		int rev=0;
		int temp=num;
		do {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}while(num!=0);
		if(rev==temp)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
			boolean rs=isPallindrum(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
