package ProgrammingPractise;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[]=new int[] {34,76,89,23,56};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];		
		}
		System.out.println("Element on original array");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("Element of new array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}

}
