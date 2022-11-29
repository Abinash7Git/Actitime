package Programming;

public class PrintVowel {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		String str1 = str.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			/*switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel are "+ch + " at position "+ i);
			}*/
			//System.out.println("-----------------");
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				char ch1 = ch;
				System.out.println(ch1);
			}
		}

	}

}
