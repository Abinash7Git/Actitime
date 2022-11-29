
public class REplaceSum {
	public static void replaceSum(int x[])
	{
	
		for(int i=0;i<x.length;i++) {
			int sum=0;
			while(x[i]!=0)
			{
				sum=sum+x[i]%10;
				x[i]=x[i]/10;
			}
			 x[i]= sum;
			    }
		}	
	
	public static void main(String[] args) {
	   int ar[]= {78,56,14,23,65};
	   System.out.println("print the array origoinal element");
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.println(ar[i]);
	   }
	   replaceSum(ar);
	   System.out.println("after updation");
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.println(ar[i]);
	   }
	   

	}

}
