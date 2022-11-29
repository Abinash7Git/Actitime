package Programming;

public class Fibonacii {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int num=1;
		while(num<10)
		{
			n3=n1+n2;
			System.out.println(n3);
			num++;
			n1=n2;
			n2=n3;
		}

	}

}
