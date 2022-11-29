import java.util.Scanner;

public class DecToHexa {
	public static String convertToHexa(int dec)
	{
		String res=" ";
		do {
			int d=dec%16;
			if(d<9)
				res=d+res;
			else
				res=(char)(d+65)+res;
			dec=dec/16;
		}while(dec!=0);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int dec=sc.nextInt();
		String rs=convertToHexa(dec);
		System.out.println("After conversion "+rs);
		

	}

}
