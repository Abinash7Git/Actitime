package ARRAYSTRINGPROGRAM;

import java.util.LinkedHashSet;

public class DuplicateWord {

	public static void main(String[] args) {
		String str="Abinash Sahoo Going To Abinash Sahoo Sahoo";
		String[] ch = str.split(" ");
		LinkedHashSet<String>hs=new LinkedHashSet<String>();
		
		for(String word1:ch)
		{
			hs.add(word1);
		}
		
		for(String word2:hs)
		{
			int count=0;
			for(String word3:ch)
			{
				
				if(word3.equals(word2))
				{
					count++;
				}
			}if(count>=2)
				System.out.println(word2);
		}
		

	}

}
