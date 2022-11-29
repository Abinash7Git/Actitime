package ProgrammingPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		  HashMap map=new HashMap();  
		    //Adding elements to map  
		    map.put(1,"Amit");  
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit");  
		    //Traversing Map  
		    //Set set=map.entrySet();
		   // System.out.println(set);
           System.out.println(map.entrySet());
           System.out.println(map.keySet());
	}

}
