package ARRAYSTRINGPROGRAM;

public class CheckPanagram {

	public static void main(String[] args) {
		String str="Abcdefghijklmnopqrstuvwxyz";
		str=str.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
			{
				System.out.println("String is not panagram");
			}
			else
			{
				System.out.println("String is panagram");
			}
		}

	}

}
