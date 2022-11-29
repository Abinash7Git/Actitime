package ProgrammingPractise;

public class StringPractise2 {
	public static String isConvert(String str)
	{
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				ch[i]=(char)(ch[i]-32);
		}String rev=new String(ch);
		return rev;
	}

	public static void main(String[] args) {
		String str="Jay Shree Ram";
		String ls=isConvert(str);
		System.out.println("After conversion is "+ls);

	}

}
