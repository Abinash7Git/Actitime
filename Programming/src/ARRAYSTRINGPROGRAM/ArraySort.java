package ARRAYSTRINGPROGRAM;

public class ArraySort {

	public static void main(String[] args) {
		int ar[]= {22,67,45,90,23,67};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp=0;
				if(ar[i]>ar[j])
				{
					temp=ar[i];
				    ar[i]=ar[j];
				    ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}System.out.println(ar[ar.length/2]);

	}

}
