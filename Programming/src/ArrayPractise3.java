
public class ArrayPractise3 {
	public static int isProduct(int ar[])
	{
		int product=1;
		for(int i=0;i<ar.length;i++)
		{
			product=product*ar[i];
		}return product;
	}

	public static void main(String[] args) {
		int ar[]= {3,5,2,6,9};
		int product=isProduct(ar);
		System.out.println("Product of the array element is "+product);

	}

}
