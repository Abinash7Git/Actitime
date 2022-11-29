
public class MergeArray {
	public static int [] mergeArray(int ar[],int br[])
	{
		int cr[]=new int[ar.length+br.length];
		for(int i=0;i<ar.length;i++)
		{
			cr[i]=ar[i];
		}
		for(int i=0;i<br.length;i++)
		{
			cr[ar.length+i]=br[i];
		}
			return cr;
	}

	public static void main(String[] args) {
		int ar[]= {23,45,67};
		int br[]= {12,67,54,32};
		int cr[]=mergeArray(ar,br);
		for(int i=0;i<cr.length;i++)
		{
			System.out.println(cr[i] +" ");
		}

	}

}
