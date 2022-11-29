package ProgrammingPractise;

public class PrintDuplicate {

	public static void main(String[] args) {
		int ar[]= {23,45,76,12,89,23,45};
		for(int i=0;i<ar.length;i++)
		{
			int ar1 = ar[i];
			for(int j=i+1;j<ar.length;j++)
				if(ar[i]==ar[j])
					System.out.println(ar[i]);
				
		}

	}

}
