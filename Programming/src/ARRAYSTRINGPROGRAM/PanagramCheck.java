package ARRAYSTRINGPROGRAM;

public class PanagramCheck {
	public static boolean isPanagram(String str)
	{
		String str1 = str.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(str1.indexOf(ch)==-1)
			return false;
		}return true;
	}

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		boolean rs=isPanagram(str);
		if(rs==true)
		System.out.println("String is Panagram");
		else
			System.out.println("String is not a panagram");
		
		
		
		
		
	}
}
