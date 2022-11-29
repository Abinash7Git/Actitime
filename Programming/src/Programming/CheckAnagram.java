package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static boolean reverseString(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
			return false;
		else 
		{
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2)==true)
		{
			return true;
		}
		else
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean rs=reverseString(str1,str2);
        if(rs==true)
        System.out.println("String are anagram");
        else 
        	System.out.println("both string are not anagram");
	

	}

}
