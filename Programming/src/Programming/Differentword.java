package Programming;
//not solved this program
import java.util.Arrays;

//import java.util.Arrays;

public class Differentword {

	public static void main(String[] args) {
		String str="Abinash is a good guy Abinash";
		String[] ch = str.split(" ");
		//System.out.println(Arrays.toString(ch));
       /*for(int i=0;i<ch.length;i++)
       {
    	   System.out.println(ch[i]);
       }*/
		String ch1=Arrays.toString(ch);
		for(int i=0;i<ch1.length();i++)
		{
			for(int j=i+1;j<ch1.length();j++)
			{
				if(ch1.charAt(i)==ch1.charAt(j))
					System.out.println(ch1);
			}
		}
	}

}
