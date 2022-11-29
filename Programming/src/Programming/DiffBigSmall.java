package Programming;

public class DiffBigSmall {

	public static void main(String[] args) {
		int num=96732;
		int big=0;
		int small=9;
		do {
			int d=num%10;
			if(d>big)
				big=d;
			 if(d<small)
				small=d;
			num=num/10;
		}while(num!=0);
		System.out.println(big-small);

	}

}
