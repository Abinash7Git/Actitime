package ARRAYSTRINGPROGRAM;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			int k=i;
			for(int j=1;j<=2*(n-i)+1;j++)
			{
				System.out.print(k+" ");
				if(j<n)
					k++;
				else
					k--;
			}
			System.out.println();
		}

	}

}
