package Programming;

import java.util.Scanner;

public class SwapFirstcharToLast {
	public static String reverseString(String str)
	{
		char ch[]=str.toCharArray();
		int f=0;
		for(int i=0;i<str.length();i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}String rev=new String(ch);
		return rev;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String str=sc.nextLine();
        String rs=reverseString(str);
        System.out.println("Reverse string will be "+rs);
	

	}

}
