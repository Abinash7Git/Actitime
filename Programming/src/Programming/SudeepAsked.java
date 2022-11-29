package Programming;

public class SudeepAsked {

	public static void main(String[] args) {
		String str="TestYantrA";
		//char[] ch = str.toCharArray();
		char str1 = ' ';
         for(int i=0;i<str.length();i++)
         {
        	 char ch=str.charAt(i);
        	 if(ch>='A'&&ch<='Z')
        	 {
        		  str1=ch;
        		  System.out.println(str1);
        	 }
        	 
         }
        
        
	}

}
