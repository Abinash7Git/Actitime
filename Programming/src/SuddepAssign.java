import java.util.Scanner;

public class SuddepAssign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2&&n1<n3 ||n1>n3&&n1<n2) {
			System.out.println(n1 + " will be middle number");
		}
		else if (n2>n1&&n2<n3 ||n2>n3&&n2<n1){
			System.out.println(n2 +" number will be middle number");
		}
			else {
				System.out.println(n3 +" number will be middle number");
			}
			
		

	}

}
