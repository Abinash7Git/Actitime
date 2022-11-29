import java.util.Scanner;

public class AscendingArray {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arrya size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("printing the element in original way");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++) {
		       
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				temp=ar[i];
			   ar[i]=ar[j];
		       ar[j]=temp;
			}		}
		}
		System.out.println("array element after sorted");
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println(ar[i]);
		}
		     System.out.println("first numberis "+ar[0]);  
		     System.out.println("last number is "+ar[ar.length-1]);
		       
			 
		  
		
	}

}
