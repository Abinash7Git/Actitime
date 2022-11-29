package Programming;

public class perfect100 {
	public static boolean isPerfect(int num)
	{
		int j=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				j=j+i;
		}if(j==num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		for(int i=1;i<100;i++)
		{
			boolean rs=isPerfect(i);
			if(rs==true)
				System.out.println(i);
		}

	}

}
