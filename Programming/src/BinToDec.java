import java.util.Scanner;

public class BinToDec {
	public static int convertToDec(int bin)
	{
		int dec=0;
		int pw=1;
		do {
			int d=bin%10;
			dec=dec+d*pw;
			pw=pw*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number");
		int bin=sc.nextInt();
		int rs=convertToDec(bin);
	    System.out.println("after conversion "+rs);

	}

}
