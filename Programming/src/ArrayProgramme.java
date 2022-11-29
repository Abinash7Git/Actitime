
public class ArrayProgramme {

	public static void main(String[] args) {
		int ar[]= {69,54,21,9,-67};
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
			
		}
		System.out.println("----------");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=0;
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
			
		
		
		
		
	}

}
