package Programming;

public class Student5 implements Comparable<Student5> {
	int id;
	String name;
	int age;
	
	public Student5(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student5 st) {
		if(this.name.compareTo(st.name)>1)
			return 1;
		else if(this.name.compareTo(st.name)==0)
			return 0;
		else
			return -1;
		
	}
	
	
	

}
