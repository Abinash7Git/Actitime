import java.util.Scanner;

public class ReverseSentence {
	public static String conversion(String str)
	{
		char ch[]=str.toCharArray();
		str=" ";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				str=str+ch[j];
				j--;
			}
			if(i<ch.length) 
				str=str+ch[i];
		}return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String st=sc.nextLine();
		String rs=conversion(st);
		System.out.println("After conversion "+rs);
	}

}
