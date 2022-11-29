import java.util.Scanner;

public class String4 {
	public static boolean isPallindrum(String st)
	{
		int i=0;int j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		boolean rs=isPallindrum(str);
		if(rs==true)
			System.out.println("string is pallindrum");
		else
			System.out.println("string is not pallindrum");

	}

}
