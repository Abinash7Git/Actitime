package ProgrammingPractise;

import java.util.*;

public class Coolection5 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>hm=new TreeMap<>();
		hm.put(4,"Abinash");
		hm.put(1,"wbinash");
		hm.put(45,"fbinash");
		hm.put(32,"zbinash");
		hm.put(90,"kbinash");
		hm.put(34,"Sabinash");
		hm.put(1,"hdudjd");
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.get(90));
		System.out.println(hm.values());
		System.out.println("----------------------");
		
		for(Map.Entry print:hm.entrySet())
		{
			System.out.println(print.getKey()+" "+print.getValue());
		
		}
	}

}
