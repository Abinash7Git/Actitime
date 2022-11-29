package ARRAYSTRINGPROGRAM;

public class ConvertLower {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			else
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		String rev=new String(ch);
		System.out.println(rev);

	}

}
