import java.util.Scanner;

public class String3 {
	public static int countVowel(String st)
	{
		int count=0;
		String v="AEIOUaeiou";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(v.indexOf(ch)==-1)
				count++;
		}return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int rs=countVowel(str);
		System.out.println("total vowel number is"+rs);

	}

}
