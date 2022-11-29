package Programming;

public class EvenOdd {
	public static int[] checkEvenOdd(int x[])
	{
		int ec=0;
		int oc=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
				ec++;
			else
				oc++;
		}
			int count[]={ec,oc};
		return count;
	}

	public static void main(String[] args) {
		int ar[]={23,45,67,89,90,54,77,31,33};
		int rs[]=checkEvenOdd(ar);
			System.out.println(rs[0]);
			System.out.println(rs[1]);
		
		

	}

}
