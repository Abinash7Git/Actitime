package ProgrammingPractise;

public class StringPractise {

	public static void main(String[] args) {
		String str="Abinash Sahoo weds Liza rani Sahoo";
		int count=0;
		String str1=str.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			count++;
		}
		System.out.println("total number of vowel presenet in string is "+count);

	}

}
