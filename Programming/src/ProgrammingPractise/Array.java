package ProgrammingPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int ar[]= {34,87,32,78,90};
		System.out.println("printing the array "+Arrays.toString(ar));
		ArrayList <Integer> al=new ArrayList<Integer>();
		for(int lang:ar)
		al.add(lang);
		System.out.println(al);

	}

}
