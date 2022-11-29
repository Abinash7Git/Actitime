import java.util.Scanner;

public class String8 {
	public static int countWord(String st)
	{
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}return count;
	}

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the string");
		  String str=sc.nextLine();
		  int rs=countWord(str);
		  System.out.println("Number of word is "+rs);

	}

}
