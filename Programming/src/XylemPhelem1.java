
public class XylemPhelem1 {
	
	public static boolean isXylemPhelem(int num)
	{
		int ms = 0,os=0;
			int d=num%10;
			os=os+d;
			num=num/10;
			while(num>9)
			{
				ms=ms+num%10;
				num=num/10;
			}os=os+num;
		if(ms==os)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num=4534;
		boolean rs=isXylemPhelem(num);
		if(rs==true)
			System.out.println("number is xylem");
		else
		System.out.println("number is phelem");

	}

}
