package ARRAYSTRINGPROGRAM;

import java.util.HashSet;

public class WordRepeated {

	public static void main(String[] args) {
		String str="Abinash Sahoo Abinash Sahoo";
		    String[] ch = str.split(" ");
		    HashSet<String> hs=new HashSet<String>();
		    for(String ch1:ch)
		    {
		    	hs.add(ch1);
		    }
		    
		    for(String ch2:hs)
		    {
		    	int count=0;
		    	for(String ch3:ch)
		    	{
		    		
		    		if(ch3.equals(ch2))
		    		{
		    			count++;
		    		}
		    	}System.out.println(ch2+" "+count);
		    }
		    
	 }
		   
	}
	





