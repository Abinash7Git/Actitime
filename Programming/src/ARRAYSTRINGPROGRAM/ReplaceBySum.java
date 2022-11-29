package ARRAYSTRINGPROGRAM;

public class ReplaceBySum {

	public static void main(String[] args) {
		int ar[]= {23,56,89,34,67};
		for(int i=0;i<ar.length;i++)
		{
			int sum=0;
			do {
				int d=ar[i]%10;
				 sum=sum+d;
				ar[i]=ar[i]/10;
			}while(ar[i]!=0);
			ar[i]=sum;
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
