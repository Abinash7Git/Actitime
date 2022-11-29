package Programming;

public class PrintDuplicatechar {

	public static void main(String[] args) {
		String str="Abinash is a good guy";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					System.out.print(ch[j]);
			}
		}

	}

}
