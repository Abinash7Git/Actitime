package ARRAYSTRINGPROGRAM;

public class StudentEquals {
	int id;
	String name;
	int age;
	
	public StudentEquals(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public static void main(String []args)
	{
		StudentEquals std=new StudentEquals(101,"Abinash",25);
		StudentEquals std1=new StudentEquals(201,"Abinash",35);
		StudentEquals std2=new StudentEquals(301,"Abinash",15);
		
		System.out.println(std2);
		System.out.println(std2.equals(std1));
		
		
	}
	
	public String toString() {
		return id +" "+" "+name+" "+age;
	}
	
	public boolean equals(StudentEquals ob) {
		//StudentEquals eq=(StudentEquals)ob;
		if(this.name==ob.name)
			return true;
		else
			return false;
	}
	
	

}
