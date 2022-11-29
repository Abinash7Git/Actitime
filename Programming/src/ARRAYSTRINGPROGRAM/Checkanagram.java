package ARRAYSTRINGPROGRAM;

import java.util.Arrays;

public class Checkanagram {

	public static void main(String[] args) {
		String str="Abinash";
		String str1="hsanibA";
		
		String str2 = str.toLowerCase();
		String str3 = str1.toLowerCase();
		if(str2.length()!=str3.length())
		{
			System.out.println("Both are not anagram");
		}
		else {
			char[] ch1 = str2.toCharArray();
			char[] ch2=str3.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)==true)
			{
				System.out.println("both are anagram");
			}
		}

	}

}
