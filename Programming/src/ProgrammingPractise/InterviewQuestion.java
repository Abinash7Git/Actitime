package ProgrammingPractise;

import java.util.ArrayList;
import java.util.Collections;

public class InterviewQuestion {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		 int num=3425;
		 do {
		 int d=num%10;
		 al.add(d);
		 num=num/10;
		 }while(num!=0);
		 Collections.sort(al);
		 System.out.println(al);
		 int max=0;
		 for(int i=al.size()-1;i>=0;i--)
		 {
			 max=max*10+al.get(i);
		 }
		 System.out.println("Maximum number is "+max);
		 

	}

}
