package ProgrammingPractise;

public class ReverseWordDeep {

	public static void main(String[] args) {
		String s1="Welome";
		String s2="Qspider";
		String s=s1+s2;
		s2=s.substring(0,s.length()-s2.length());
		s1=s.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+" "+s2);

	}

}
