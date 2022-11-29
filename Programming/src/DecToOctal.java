import java.util.Scanner;

public class DecToOctal {
	public static String convertOctal(int dec)
	{
		String str=" ";
		do {
			int d=dec%8;
			str=d+str;
			dec=dec/8;
			}while(dec!=0);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter octal number");
		int  dec=sc.nextInt();
		String rs=convertOctal(dec);
		System.out.println("After conversion "+rs);

	}

}
