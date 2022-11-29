
public class BigSmall {
	
	public static int isDifference(int num)
	{
		int big,small;
		big=small=num%10;
		do {
			int d=num%10;
			if(d>big)
				big=d;
			if(d<small)
				small=d;
			num=num/10;
		}while(num!=0);
		return big-small;
	}

	public static void main(String[] args) {
		int num=32457893;
		int diff=isDifference(num);
		System.out.println("difference between two number is" + diff);
		

	}

}
