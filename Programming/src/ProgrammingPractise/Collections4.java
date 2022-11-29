package ProgrammingPractise;

import java.util.TreeSet;

public class Collections4 {

	public static void main(String[] args) {
		TreeSet <Book> ts=new TreeSet<>();
		
		Book b1=new Book(1,"Bjava","james gosling","xyz",20);
		Book b2=new Book(12,"Ajava1","james gosling1","xyz1",200);
		Book b3=new Book(120,"Zjava2","james gosling2","xyz2",2000);
		 
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		for(Book  print:ts)
		{
			//System.out.println(print);
			System.out.println(print.id+" "+print.author+" "+print.name+" "+print.publisher+" "+print.quantity);
		}
		
		

	}

}
