package ProgrammingPractise;

public class DuplicateElement {

	public static void main(String[] args) {
		int ar[]= {23,45,12,78,56,45};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
					System.out.println(ar[j]);
					
			}
		}
		

	}

}
