package Programming;

import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String str) {
		String rev=" ";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
			
		}
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
