package ProgrammingPractise;

public class ReplaceSum {

	public static void main(String[] args) {
		int ar[]= {23,41,78,45,90};
		for(int i=0;i<ar.length;i++)
		{
			int sum=1;
			do {
				int d=ar[i]%10;
				sum=sum*d;
				ar[i]=ar[i]/10;
			}while(ar[i]!=0);
			ar[i]=sum;
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}

	}

}
