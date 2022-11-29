package Programming;

public class StringExample {

	public static void main(String[] args) {
		String str="Abinash is good Boy";
		String str1 = str.concat("bad boy");
		System.out.println(str1);
		StringBuffer sb=new StringBuffer("Abinash");
		sb.append(" "+"Gudu");
		System.out.println(sb);
	}

}
