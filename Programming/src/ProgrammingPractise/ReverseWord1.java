package ProgrammingPractise;

import java.util.Arrays;

public class ReverseWord1 {

	public static void main(String[] args) {
     String str="Abinash sahoo";
     /* String[] st = str.split(" ");
      System.out.println(Arrays.toString(st));
      for(int i=st.length-1;i>=0;i--)
      {
    	  String str1 = st[i];
      
      System.out.print(str1 +" ");
      }*/
     for(int i=0;i<str.length();i++)
     {
    	 char ch = str.charAt(i);
    	 char ch1 = 0;
		if(ch!=' ')
    		 ch1=ch;
		System.out.print(ch1);
    		 
     }
	}

}
