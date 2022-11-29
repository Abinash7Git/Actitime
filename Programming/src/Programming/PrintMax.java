package Programming;

public class PrintMax {
	public static int checkBig(int ar[])
	{
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
			{
				big=ar[i];
			}
		}return big;
	}
	public static int checkSmall(int ar[])
	{
	    int small=ar[0];
	    for(int i=1;i<ar.length;i++)
	    {
	    	if(ar[i]<small)
	    		small=ar[i];
	    }return small;
	}

	public static void main(String[] args) {
		int ar[]= {34,21,56,89,90,43};
		int big=checkBig(ar);
		System.out.println("Big element "+big);
         int small=checkSmall(ar);
         System.out.println("smallest number is "+small);
	}

}
