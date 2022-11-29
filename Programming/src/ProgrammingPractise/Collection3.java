package ProgrammingPractise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collection3 {

	public static void main(String[] args) {
		
		LinkedList <String> hs=new LinkedList<>();
		hs.add("Abinash");
		hs.add("Susanta");
		hs.add("Bansidhar");
		hs.add("Bansidhar1");
		hs.add("Bansidhar2");
		System.out.println(hs.getFirst());
		System.out.println("-------------");
		Iterator<String> itr=hs.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------");
		ListIterator<String> lit=hs.listIterator(hs.size());
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}

	}

}
