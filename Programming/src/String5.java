import java.util.Scanner;

public class String5 {
	public static String convertLower(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}String rev=new String(ch);
		return rev;
	}
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String lc=convertLower(str);
		System.out.println("After conversion "+lc);
	}

}
