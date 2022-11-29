import java.util.Arrays;

public class SmallestEvenInArray {
	
	public static int smallestEven(int x[])
	{ int num=0;
		Arrays.sort(x);
		for(int i=0;i<x.length;i++)
		{ 
			if(x[i]%2!=0) {
				 num=x[i];
				 break;
			}
		}return num;
	}
	public static void main(String[] args) {
		int ar[]= {10,40,50,6,3,100,5,1,200};
		int num=smallestEven(ar);
		
		System.out.println("smallest even number in array " +num);

	}

}
