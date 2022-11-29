import java.util.Scanner;

public class DecToBin {
	public static String convertBin(int dec)
	{
		String str=" ";
		do {
			int d=dec%2;
			str=d+str;
			dec=dec/2;
		}while(dec!=0);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=sc.nextInt();
		String rs=convertBin(n);
		System.out.println("After conversion "+rs);

	}

}
