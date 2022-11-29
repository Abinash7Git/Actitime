package ProgrammingPractise;

public class StringPractise1 {
	public static String toConvertLower(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);		
			}String rev=new String(ch);
			return rev;
	}

	public static void main(String[] args) {
		String str="RAGHUPATI RAGHAV RAJA RAMA";
		String str1=toConvertLower(str);
		System.out.println("After conversion "+str1);

	}

}
