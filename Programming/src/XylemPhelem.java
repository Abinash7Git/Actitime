
public class XylemPhelem {
	public static String isXylemPhelem(int num)
	{
		int os=0;
		int ms=0;
		os=os+num%10;
		num=num/10;
		while(num>9)
		{
			ms=ms+num%10;
			num=num/10;
		}
		os=os+num;
		if(os==ms)
			return "xylem";
		else
			return "phelem";
		
}
	public static void main(String[] args) {
	 int num=4387;
	 String rs=isXylemPhelem(num);
	 if(rs=="xylem")
	 System.out.println("number is xylem number");
	 else
	 System.out.println("number is phelem number");

	}

}
