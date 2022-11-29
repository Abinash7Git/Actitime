package ARRAYSTRINGPROGRAM;

public class ReverseWord {

	public static void main(String[] args) {
		String str="Abinash Sahoo";
		String[] ch = str.split(" ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}

	}

}
