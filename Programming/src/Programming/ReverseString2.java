package Programming;

public class ReverseString2 {

	public static void main(String[] args) {
		String str="Abinash is a good boy";
		String empt=" ";
		for(int i=0;i<str.length();i++)
		{
			empt=str.charAt(i)+empt;
		}
		System.out.println(empt);

	}

}
