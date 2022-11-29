package Programming;

public class XylemPhelem {
	public static boolean xylemphelem(int num)
	{
		int os=0;
		int ms=0;
		os=os+num%10;
		num=num/10;
		while(num>9) {
			ms=ms+num%10;
		num=num/10;
		}
		os=os+num;
		if(os==ms)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num=352;
		boolean rs=xylemphelem(num);
		if(rs==true)
			System.out.println("Number is xylem");
		else
			System.out.println("number is phelem");

	}

}
