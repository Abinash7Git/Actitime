
public class MergerArraySorted {
	public static int[] sortedArray(int ar[],int br[])
	{
		int cr[]=new int[ar.length+br.length];
		int i=0,j=0,k=0;
		while(i<ar.length && i<br.length)
		{
			if(ar[i]<br[j])
			
				cr[k++]=ar[i++];
			
			else 
				cr[k++]=br[j++];
			
			}
			while(i<ar.length)
			{
				cr[k++]=ar[i++];
				//i++;
				//k++;
			}
			while(j<br.length)
			{
				cr[k++]=br[j++];
				
			}
			
		
		return cr;
	}

	public static void main(String[] args) {
		int ar[]= {1,3,5,7,9};
		int br[]= {2,4,6};
		int dr[]=sortedArray(ar,br);
		for(int i=0;i<dr.length;i++) {
		
		System.out.println("After sorting "+dr[i]);
		}
	}

}
