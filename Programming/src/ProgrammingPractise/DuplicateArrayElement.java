package ProgrammingPractise;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		int ar[]=new int[] {34,21,67,54,90,34};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[i]==ar[j])
				{
						System.out.println(ar[j]);
				}
			}
		}

	}

}
