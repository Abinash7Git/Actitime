package ProgrammingPractise;

public class CopyArray1 {

	public static void main(String[] args) {
		int ar[]= {23,67,43,89,12,56};
		//int ar1[]= new int[ar.length];
		for(int i=1;i<ar.length;i+=2)
		{
         System.out.println(ar[i]);
		}
		System.out.println("-------------------");
		for(int i=0;i<ar.length;i+=2)
		{
			System.out.println(ar[i]);
		}
	}

}
