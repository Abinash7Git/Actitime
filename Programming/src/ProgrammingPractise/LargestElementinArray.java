package ProgrammingPractise;

public class LargestElementinArray {

	public static void main(String[] args) {
		int ar[]=new int[] {34,89,67,45,909,-546};
		int small=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
				small=ar[i];
		}
		System.out.println("Biggest element is "+small);

	}

}
