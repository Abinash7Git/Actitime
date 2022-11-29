package ProgrammingPractise;

public class ReverseString {

	public static void main(String[] args) {
		String str="Abinash Good Boy";
		String rev=" ";
		for(int i=0;i<str.length();i++)
		{
			 rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse String will be "+rev);

	}

}
