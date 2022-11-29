package Programming;

public class ReverseWord {

	public static void main(String[] args) {
		String str="Abinash boy";
		String[] s1 = str.split(" ");
		String reverseword="";
		String reverseString=" ";
		for(String word:s1)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseword=word.charAt(i)+reverseword+" ";
				//System.out.print(reverseword +"  ");
			}
			//System.out.print(reverseword +"  ");
		}
		System.out.print(reverseword);	
		

	}

}
