package ARRAYSTRINGPROGRAM;

public class PrintInReverse {

	public static void main(String[] args) {
		int ar[]= {12,67,89,34,56};
		int i=0;
		int j=ar.length-1;
		while(i<j)
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		for( i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
