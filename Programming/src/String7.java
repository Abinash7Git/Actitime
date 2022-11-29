import java.util.Scanner;

public class String7 {
	public static String convert(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1 && ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{ 
				if(ch[i]>='a'&&ch[i]<='z')
				 ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
			String rev=new String(ch);
	        return rev;
		}
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String str=sc.nextLine();
     String rs=convert(str);
     System.out.println("After Updation"+rs);

	}

}
