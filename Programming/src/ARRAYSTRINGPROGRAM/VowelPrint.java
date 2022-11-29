package ARRAYSTRINGPROGRAM;

public class VowelPrint {

	public static void main(String[] args) {
		String str="Abinash sahoo";
		String str1 = str.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				 char ch1 =ch;
				 System.out.println(ch1+ " vowel is present in "+i);
			}
		}

	}

}
