package Programming;

import java.util.Arrays;

public class Array2nd {

	public static void main(String[] args) {
		int ar[]= {23,34,56,43,12,90};
		//Arrays.sort(ar);
		//System.out.println(ar[1]);
		//System.out.println(ar[ar.length-2]);
		int big=ar[0];
		int big1 = 0;
		for(int i=1;i<ar.length;i++)
		{
			if(big>ar[i])
				big=ar[i];
			else if(big<ar[i])
				big1=ar[i];
			System.out.println(big1);
			break;
			
		}
		

	}

}
