package ARRAYSTRINGPROGRAM;

public class VowelConsonantcapital {

	public static void main(String[] args) {
		String str="AbinashSahoo78";
		int uc=0,lc=0,vc=0,cc=0,dc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			     if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			         {
				        vc++;
			         }
			        else {
				        cc++;
			            }
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else {
					cc++;
				}
			}
			else {
				dc++;
			}
			
			
		}
		System.out.println("total number of uc is "+uc);
		System.out.println("total number of lc is "+lc);
		System.out.println("total number of vc is "+vc);
		System.out.println("total number of cc is "+cc);
		System.out.println("total number of dc is "+dc);
		

	}

}
