
public class Driver1 {

	public static void main(String[] args) {
		 Bhujendra b1=new Bhujendra("Abinash",232,50000.0d,"Test Engineer");
		 Bhujendra b2=new Bhujendra("sbinash",233,40000.0d,"Tester");
		 Bhujendra b3=new Bhujendra("kbinash",234,30000.0d,"Test Lead");
		 
		 displayDetails(b1);
		 displayDetails(b2);
		 displayDetails(b3);
		 }
	
	public static void displayDetails(Bhujendra e)
	{
		System.out.println("name: "+e.name);
		System.out.println("Eid: "+e.id);
		System.out.println("salary: "+e.salary);
		System.out.println("desgination: "+e.designation);
		e.work();
		System.out.println("--------------------------------");
	}

}
