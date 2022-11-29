package ARRAYSTRINGPROGRAM;

public class FirstLettertoSmall {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		String rev=new String(ch);
		System.out.println(rev);

	}

}
