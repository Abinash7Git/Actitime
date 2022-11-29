
public class ReverseArray {
	public static void reverseArray(int x[])
	{  int temp=0;
		int i=0;
		int j=x.length-1;
		while(i<j)
		{
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
	 int ar[]= {45,65,78,23,69,14};
	 System.out.println("printing the array element");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.println(ar[i]);
	 }
	 reverseArray(ar);
	 System.out.println("after reverse the array element are");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.println(ar[i]);
	 }
	}

}
