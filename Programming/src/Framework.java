import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Framework {

	public synchronized static void main(String... args) {
		HashSet<String> al=new HashSet<String>();
		al.add("Abinash");
		al.add("Shruti");
		al.add("Nagraj");
		
		System.out.println(al);
		System.out.println("-----------");
		/*for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));	
		}*/
		System.out.println("-----------");
		for(String s:al)
		{
			System.out.println(s);
		}
				//HashSet<String>al1=new HashSet();
				al.add("Ramya");
				al.add("Shruti");
				al.add(" ");
				al.add(null);
				System.out.println(al);
				
				
				LinkedList<String> lk=new LinkedList<String>();
				System.out.println(lk.isEmpty());
				lk.add("Abinash");
				lk.add("Sudeep");
				lk.add("Nagraj");
				System.out.println(lk.isEmpty());
				
				System.out.println(lk);
				System.out.println("-----------");
				for(int i=0;i<lk.size();i++)
				{
					System.out.println(lk.get(i));	
				}
				System.out.println(lk.getFirst());
			
				

	}

}
