
public class CountDivisor {

	public static void main(String[] args) {
		int num=12;
		int rs=isDivisor(num);
		System.out.println(rs + " total of divisor of this number ");

	}
  public static int isDivisor(int num)
  {
	  int count=0;
	  for(int i=1;i<=num/2;i++)
	  {
		  if(num%i==0)
			  count++;
	  }
	  return count;
  }
}
