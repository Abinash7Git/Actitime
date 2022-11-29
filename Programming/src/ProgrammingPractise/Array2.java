package ProgrammingPractise;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int arr[]= {20,48,23,56,32};
		System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] +" ");
	}
	System.out.println("----------------");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] +" ");
		}

	}

}
