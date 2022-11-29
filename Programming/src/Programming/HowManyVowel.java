package Programming;

import java.util.Scanner;

public class HowManyVowel {
	
	public static int countVowel(String str) {
		String str1=str.toLowerCase();
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||(ch=='u'))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int rs=countVowel(str);
		System.out.println("total number of vowel is "+rs);
		

	}

}
