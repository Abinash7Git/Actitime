package ProgrammingPractise;

public class Fibonacci {

	public static void main(String[] args) {
		
    int count=10;
    int n1=0,n2=1;
    System.out.println(n1+" "+n2);
    for(int i=2;i<count;i++)
    {
    	int n3=n1+n2;
    	System.out.println(" "+n3);
    	n1=n2;
    	n2=n3;
    }
	}

}
