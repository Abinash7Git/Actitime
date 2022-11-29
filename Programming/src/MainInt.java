import java.util.Comparator;
import java.util.TreeSet;

public class MainInt {

	public static void main(String[] args) {
		
		Comparator com=new Comparator( ){
			                        public int compare(Object o1,Object o2) {
			                        	Employee e1=(Employee)o1;
			                        	Employee e2=(Employee)o2;
			                        	return ((Integer)e1.id).compareTo(e2.id);
			                        }
		};
		
		
		TreeSet ts=new TreeSet(com);
		ts.add(new Employee(123,"Abinash",45784));
		ts.add(new Employee(223,"Sbinash",9578));
		ts.add(new Employee(823,"Gbinash",6578));
		ts.add(new Employee(523,"Rbinash",8578));
		ts.add(new Employee(623,"Tbinash",5578));
		
		
		for (Object obj:ts) {
			System.out.println(obj);
		}
		System.out.println("------------------------------------");
		Comparator namecom=new Comparator( ){
                                        public int compare(Object o1,Object o2) {
            	                         Employee e1=(Employee)o1;
            	                          Employee e2=(Employee)o2;
            	                          if(e1.name.compareTo(e2.name)<0)
            	                        	  return -1;
            	                          else
            	                        	  return 1;
                                        }
		};
       TreeSet ts1=new TreeSet(namecom);
       ts1.addAll(ts);
       for(Object obj: ts1)
       {
    	   System.out.println(obj);
       }
       
            }

		

	}


