package Programming;

import java.util.Scanner;

public class ReverseString1 {
	public static String reverseString(String str)
	{
		String empt=" ";
		for(int i=0;i<str.length();i++)
		{
			empt=str.charAt(i)+empt;
		}return empt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String res=reverseString(str);
		System.out.println("After reverse "+res);

	}

}
