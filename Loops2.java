package day3;

import java.util.*;

public class Loops2 {
	public static void main(String args[]) {
		
		for(int i = 0; i < 10; i++ ) {
			System.out.println("shankar" + i);
		}
		
//		int a = 2;
//		a++;
//
//		System.out.println(a);
		
		for (int j = 1; j <= 10; j++) {
			System.out.println("10x"+ j + "=" + j*10);
		}
		
		//User input table
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table:");
		int table = sc.nextInt();
		
		for(int k = 1; k <=10; k++) {
			System.out.println(table + "x" + k + "=" + k*table);
		}
		
		
}

}
