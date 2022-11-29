package ProgrammingPractise;

public class StringPractise3 {
	public static String toConvert(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else
				if(ch[i]>='A'&& ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
		}String rev=new String(ch);
		return rev;
	}

	public static void main(String[] args) {
		String str="mY NAme is abinAsh SahOO";
		String ls=toConvert(str);
		System.out.println("After conversion "+ls);

	}

}
