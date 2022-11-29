package ProgrammingPractise;

import java.util.HashMap;
import java.util.TreeMap;
//import java.util.Iterator;

public class Collection6 {

	public static void main(String[] args) {
		 HashMap<Integer,BookMap> map=new HashMap<Integer,BookMap>();    
		    //Creating Books    
		    BookMap b11=new BookMap(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    BookMap b21=new BookMap(103,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    BookMap b31=new BookMap(102,"Operating System","Galvin","Wiley",6);    
		    //Adding Books to map   
		    map.put(1,b11);  
		    map.put(2,b21);  
		    map.put(78,b31);  
		    TreeMap<Integer,BookMap> t1=new TreeMap<Integer,BookMap>(map);
		    System.out.println("ascending order"+ t1);
		    System.out.println("descending order"+t1.descendingMap());
		    
		  for(HashMap.Entry<Integer,BookMap> entry:map.entrySet())
		  {
			  int k1=entry.getKey();
			   BookMap v = entry.getValue();
			  
			  System.out.println(v);
		  }

	}

}
