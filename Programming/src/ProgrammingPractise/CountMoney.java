package ProgrammingPractise;

import java.util.Scanner;

public class CountMoney {

	public static void main(String[] args) {
		System.out.println("Enter the amount");
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        int count2000=money/2000;
        System.out.println(count2000 +" number of 2000 note");
        money=money%2000;
        int count1000=money/1000;
        System.out.println(count1000 +" number of 1000 note are their");
        money=money%1000;
         
        
	}

}
