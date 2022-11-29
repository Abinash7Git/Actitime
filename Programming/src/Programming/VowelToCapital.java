package Programming;

import java.util.Scanner;

public class VowelToCapital {
	public static String convertString(String str)
	{
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='i'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}String rev=new String(ch);
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String rs=convertString(str);
		System.out.println("After conversion "+rs);

	}

}
