
public class PrintBiggest {
	
	public static int isBiggest(int num)
	{ int max=0;
		do {
			int d=num%10;
			 max=max*10+d;
			num=num/10;
		}while(num!=0);
		return max ;
	}
	
	

	public static void main(String[] args) {
		int num=4532;
		int rs=isBiggest(num);
		System.out.println("biigest number is"+rs);

	}

}
