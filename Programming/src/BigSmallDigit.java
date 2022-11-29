
public class BigSmallDigit {

	public static void main(String[] args) {
		int num=7615;
		int big=0;
		int small=9;
		do {
			int d=num%10;
			if(d>big)
			{
				big=d;
			}
			if(d<small)
			{
				small=d;
			}
			num=num/10;
		}
			while(num>0);
		
   System.out.println("biggest number is "+big);
   System.out.println("smallest number is "+small);
	}

}
