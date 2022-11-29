package ProgrammingPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Collection5 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap <Integer,String>();
		hm.put(4,"Abinash");
		hm.put(1,"wbinash");
		hm.put(45,"fbinash");
		hm.put(32,"zbinash");
		hm.put(90,"kbinash");
		hm.put(34,"Sabinash");
		hm.put(1,"hdudjd");
		System.out.println(hm);
		System.out.println(hm.entrySet());
	    System.out.println(hm.keySet());
	    Set<Entry<Integer, String>> set = hm.entrySet();
	    Iterator<Entry<Integer, String>> itr = set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    for(Entry m:hm.entrySet())
	    {
	      System.out.println(m.getKey() +" "+m.getValue());
	    }
		

	}

}
