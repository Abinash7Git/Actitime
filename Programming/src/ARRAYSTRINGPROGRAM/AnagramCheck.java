package ARRAYSTRINGPROGRAM;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1="Abinash Sahoo";
		String str2="Sahoo abinasH";
		if(str1.length()!=str2.length())
		{
			System.out.println("2 String are not Anagram");
		}
		String str3 = str1.toLowerCase();
		String str4=str2.toLowerCase();
		
		char[] ch1=str3.toCharArray();
		char[] ch2=str4.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("Two String are Anagram");
		}

	}

}
