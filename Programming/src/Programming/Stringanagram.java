package Programming;

public class Stringanagram {

	public static void main(String[] args) {
		String str="vfbehrb";
		str.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(str.indexOf(ch)==-1)
				System.out.println("not panagram");
			else
				System.out.println("panagram");
		}

	}

}
