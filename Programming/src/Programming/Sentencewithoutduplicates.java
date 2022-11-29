package Programming;

import java.util.HashSet;

public class Sentencewithoutduplicates {

	public static void main(String[] args) {
		String str="Abinash is going to be TestEngineer to Abinash";
		String[] s1 = str.split(" ");
		HashSet<String>set=new HashSet<String>();
		for(String word1:s1) {
			set.add(word1);
		}
		System.out.println(set);
        
		for(String word2:set)
		{
			int count=0;
			for(String word3:s1)
			{
				if(word3.equals(word2))
					count++;
			}
			if(count>1)
				System.out.println(word2+" "+count);
				
				
		}
	}

}
