package ProgrammingPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Abinash");
		al.add("Going to");
		al.add("Be a IT Engineer");
		al.add("Very Soon");
		al.add(45);
		al.add('c');
		al.add(true);
		al.add(34.6f);
		System.out.println(al);
		System.out.println("------------------");
		Iterator<Object> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("--------------------");
		for(Object Abinash:al)
		{
			System.out.println(Abinash);
		}
		System.out.println("-------------");
		ListIterator<Object> lit=al.listIterator(al.size());
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
	
		}
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}

		
	}

}
