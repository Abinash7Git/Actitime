package Programming;

import java.util.HashSet;

public class DuplicateString {

	public static void main(String[] args) {
		String str="Ms dhoni is my fav dhoni my";
		String[] s1 = str.split(" ");
		HashSet<String> set=new HashSet<String>();
		for(String word:s1) {
			set.add(word);
			//System.out.println(set);
		}
		System.out.println(set);
		for(String word2:set)
		{
			int count=0;
			for(String word3:s1) {
				if(word3.equals(word2))
					count++;
				if(count==2)
					System.out.println(word2);
			}
		
		System.out.println(word2+" "+count);
		}
	}

}
