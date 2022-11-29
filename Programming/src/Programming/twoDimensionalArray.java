package Programming;

import java.util.Scanner;

public class twoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
         int row=sc.nextInt();
         int col=sc.nextInt();
         int arr[][]=new int[row][col];
         System.out.println("enter the value");
         for(int i=0;i<row;i++)
         {
        	 for(int j=0;j<col;j++)
        	 {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         System.out.println("printing the rray");
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr[i].length;j++)
        	 {
        		 System.out.print(arr[i][j] +" ");
        	 }
        	 System.out.println();
         }
	}

}
