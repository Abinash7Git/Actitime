package ARRAYSTRINGPROGRAM;

public class StringReverse {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		char[] ch = str.toCharArray();	
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		String rev=new String(ch);
		System.out.println(rev);
		

	}

}
