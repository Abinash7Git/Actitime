
public class Ex4 {

	public static void main(String[] args) {
		int a=10;
		int b[]= {10,20,30,40,50};
		try {
			String s=null;
		try {
			System.out.println(b[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("gudu");
		}
		try {
			System.out.println(a/0);
			System.out.println("done");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Susanta");
			System.out.println("handled");
		}
		//System.out.println(s.charAt(8));
		}
		catch(NullPointerException e)
		{
			System.out.println("Liza");
			System.out.println("outer catch");
		}

	}
}

	
		


