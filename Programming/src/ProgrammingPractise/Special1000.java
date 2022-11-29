package ProgrammingPractise;

public class Special1000 {
	public static boolean isSpecial(int num)
	{
		int d1=num%10;
		int d2=num/10;
		if(d1*d2+d1+d2==num)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		for(int i=1;i<1000;i++)
		{
			boolean rs=isSpecial(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
