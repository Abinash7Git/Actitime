package Programming;

import java.util.Scanner;

public class printWithoutSpace {
	public static String convertWord(String str) {
		char ch[]=str.toCharArray();
		StringBuffer string =new StringBuffer();
		//char ch1[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				string.append(ch[i]);
			}
		}String rev=new String (string);
		return rev;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String rs=convertWord(str);
		System.out.println("After conversion "+rs);

	}

}
