package ProgrammingPractise;

public class ArrayPractise5 {
	public static int[] isEvenOdd(int ar[])
	{
		int ec=0;
		int oc=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}int count[]= {ec,oc};
		return count;
	}

	public static void main(String[] args) {
		int ar[]= {23,45,67,89,22};
		int count[]=isEvenOdd(ar);
		System.out.println("Enumber of even number is "+count[0]);
		System.out.println("number of odd number is"+count[1]);

	}

}
