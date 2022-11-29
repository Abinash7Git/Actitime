package ProgrammingPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("45");
		al.add("49");
		al.add("90");
		al.add("34");
		Collections.sort(al);
		System.out.println("printing the list "+al);
		String[] ar=al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(ar));
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		

	}

}
