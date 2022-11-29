import java.util.Scanner;

public class ArrayAscending {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter array size");
	   int n=sc.nextInt();
	   int ar[]=new int[n];
	   System.out.println("enter the array element");
	   for(int i=0;i<ar.length;i++)
	   {
		   ar[i]=sc.nextInt();
	   }
	   System.out.println("printing the arrya element");
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.println(ar[i]);
	   }
	   int temp=0;
	   for(int i=0;i<ar.length;i++)
	   {
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]>ar[j])
			   {
				   temp=ar[i];
				   ar[i]=ar[j];
				   ar[j]=temp;
				   
			   }
		   }
	   }
	   System.out.println("printing the array element in sorted order");
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.println(ar[i]);
	   }
	   System.out.println("first number is " +ar[0]);
	   System.out.println("third number is "+ ar[ar.length-1]);
	}

}
