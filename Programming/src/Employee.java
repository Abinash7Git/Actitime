
public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "Employee [id=" + id + ",name=" + name + ",sal=" + sal +"]";
	}
	public int compareTo(Employee obj) {
	    // Employee e=(Employee)obj;
		
		//return ((Integer)this.id).compareTo(e.id);
		if(this.id>obj.id)
			return 1;
		else if (this.id==obj.id)
			return 0;
		else
			return -1;
		
		
	}

}
