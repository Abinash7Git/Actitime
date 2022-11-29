package ProgrammingPractise;

public class ArrayRepearted {

	public static void main(String[] args) {
		int ar[]= {23,34,56,12,45,23,12};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			}
		}

	}

}
