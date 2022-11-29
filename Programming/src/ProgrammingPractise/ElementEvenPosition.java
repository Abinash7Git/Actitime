package ProgrammingPractise;

public class ElementEvenPosition {

	public static void main(String[] args) {
		int ar[]=new int[] {23,45,12,56,78,50,32,98};
	    int sum=0;
		for(int i=0;i<ar.length;i+=2)
		{
		   sum=sum+ar[i];
		}
		System.out.println(sum);
	}

}
