package Programming;

public class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Student s1=new Student(23,"Lizani");
		Student s2=new Student(23,"Lizani");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		}
	public String toString()
	{
		return id +" "+name;
		
	}
	public boolean equals(Object ob)
	{
		Student s=(Student)ob;
		if(this.name==s.name)
			return true;
		else
			return false;	
		
	}

}
