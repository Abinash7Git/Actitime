package ARRAYSTRINGPROGRAM;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;int st=1;
		int sp=n/2;
		for(int i=1;i<=n;i++)
		{
			
			
		
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
				for(int k=1;k<st;k++)
				{
					System.out.println("*"+" ");
				}
			
		if(i<n/2)
		{
			sp--;
			st++;
		}
		else
		{
         sp++;
         st--;
		}
	}
		System.out.println();
}
}

