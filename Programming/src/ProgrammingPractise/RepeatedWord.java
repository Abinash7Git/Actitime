package ProgrammingPractise;

import java.util.Arrays;

public class RepeatedWord {

	public static void main(String[] args) {
		String str="Abinash weds Liza Liza Gudu Get married Abinash is very Happy Get";
		//str=str.toLowerCase();
		String[] word = str.split(" ");
		int count=0;
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(word[i]);
			}
		}

	}

}
