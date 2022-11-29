package ARRAYSTRINGPROGRAM;

public class ConvertVowelCapital {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=(char)(ch[i]-32);
			}
			
		}
		String rev=new String(ch);
		System.out.println(rev);

	}

}
