package Programming;

import java.util.Arrays;

public class ReverseArrayElement {

	public static void main(String[] args) {
		int ar[]= {23,45,76,54,90};
	System.out.println(Arrays.toString(ar));
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
		System.out.println("-----------------------");
           for(i=0;i<ar.length;i++) 
		{
		    System.out.println(ar[i]);
		}
		

	}

}
