import java.util.Scanner;

public class OctalToDec {
	public static int convertTodec(int octal)
	{
		int dec=0;
		int pw=1;
		do {
			int d=octal%10;
			dec=dec+d*pw;
			pw=pw*8;
			octal=octal/10;
		}while(octal!=0);
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter octal number");
		int octal=sc.nextInt();
		int rs=convertTodec(octal);
		System.out.println("after conversion "+rs);

	}

}
