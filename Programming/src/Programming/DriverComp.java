package Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class DriverComp {

	public static void main(String[] args) {
		Student5 std=new Student5(10,"Abinash",25);
		Student5 std1=new Student5(100,"sbinash",15);
		Student5 std2=new Student5(1000,"kbinash",35);
		
		TreeSet<Student5> ts=new TreeSet<Student5>();
		ts.add(std);
		ts.add(std1);
		ts.add(std2);
		
		//Collections.sort(ts,);
		
		for(Student5 al:ts)
		{
			System.out.println(al.id +" "+al.name+" "+al.age);
		}

	}

}
