package ProgrammingPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList<Strudent> al=new ArrayList<>();
		
		Strudent s1=new Strudent(25,30,"Abinash");
		Strudent s2=new Strudent(26,32,"Susanta");
		Strudent s3=new Strudent(20,34,"Bansidhar");
		LinkedList l=new LinkedList();
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Strudent str:al)
		{
			System.out.println(str.RollNo+" "+str.Age+" "+str.name);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Strudent st=(Strudent)itr.next();
			System.out.println(st.RollNo+" "+st.Age+" "+st.name);
		}

	}

}
