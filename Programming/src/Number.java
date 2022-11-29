import java.util.Arrays;
import java.util.List;

public class Number {

	public static void main(String[] args) {
		int ar[]= {20,30,10,50,17};
		Arrays.sort(ar);
      System.out.println(Arrays.toString(ar));
  //  System.out.println(Arrays.sort(ar,2)); 
      int br[]= {45,65,23,43,49};
      List<int[]> ls=Arrays.asList(br);
    //  System.out.println(Arrays.toString(ls));
	}

}
