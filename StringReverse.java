package day7;

import java.util.*;
public class StringReverse {
	
	public static void main(String[]args) {
		
		//1st step
		String name = "Shankar";
		
		for(int i = 6; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		
		
		//2nd step
		String name2 = "Vijaya kumar";
		
		for(int j = name2.length() -1; j >= 0; j--) {
			System.out.print(name2.charAt(j));
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String value = sc.nextLine();
		
		for(int i = value.length() -1; i>=0; i--) {
			System.out.print(value.charAt(i));
			
		}
		
		
		
		
		
		
		
	}

}
