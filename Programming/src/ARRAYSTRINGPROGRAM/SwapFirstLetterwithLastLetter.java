package ARRAYSTRINGPROGRAM;

public class SwapFirstLetterwithLastLetter {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		char[] ch = str.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}
		String rev=new String(ch);
		System.out.println(rev);

	}

}
