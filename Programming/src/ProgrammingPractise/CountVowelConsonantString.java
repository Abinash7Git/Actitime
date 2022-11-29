package ProgrammingPractise;

public class CountVowelConsonantString {

	public static void main(String[] args) {
		String str="Abinash is a Good Boy";
		int vc=0,cc=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
		        vc++;
			}
			else if(str.charAt(i)!=' ') 
			{
				cc++;
			}
			
			
		}
        System.out.println("Total number of vowel is "+vc);
        System.out.println("Total number of consonant is "+cc);
        
	}

}
