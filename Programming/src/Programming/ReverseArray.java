package Programming;

public class ReverseArray {

	public static void main(String[] args) {
		int ar[]= {23,45,67,89,32};
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("--------------");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		System.out.println("------------------");
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