import java.util.Scanner;

public class String6 {
	public static String convertToLower(String str)
	{
		char ch[]=str.toCharArray();
		String v="AEIOUaeiou";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				if(v.indexOf(ch[i])!=-1)
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' &&ch[i]<='Z')
			{
				if(v.indexOf(ch[i])==-1)
			
				ch[i]=(char)(ch[i]+32);
			}
			
			}String rev=new String(ch);
			return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String vowel=convertToLower(str);
		System.out.println("after updation "+vowel);

	}

}
