package ARRAYSTRINGPROGRAM;

public class RepeatedElement {

	public static void main(String[] args) {
		int ar[]= {20,30,40,50,20,50};
		int ar1[]= {11,12,13};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					ar[j]=ar1[0];
					ar[j]=ar1[1];
				}
			}
		}
		for(int ch1:ar)
		{
			System.out.println(ch1);
		}

	}

}
