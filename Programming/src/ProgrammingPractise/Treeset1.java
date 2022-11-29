package ProgrammingPractise;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {  
		 TreeSet<Integer> set=new TreeSet<Integer>();    
		         set.add(24);    
		         set.add(66);    
		         set.add(12);    
		         set.add(15);    
		        System.out.println(set);
		        Iterator<Integer>itr=set.descendingIterator();
		        while(itr.hasNext())
		        {
		        	System.out.println(itr.next());
		        }
		    

	}

}
