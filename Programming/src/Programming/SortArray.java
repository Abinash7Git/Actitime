package Programming;

public class SortArray {

	public static void main(String[] args) {
		int ar[]= {23,21,56,90,20,78,56};
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
				  temp = ar[i];
				    ar[i]=ar[j];
				    ar[j]=temp;
				}
				
			}
		}
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}

	}

}
