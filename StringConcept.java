package day5;

import java.util.*;

public class StringConcept {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		
		System.out.println(name);
		
		System.out.println(name.length());
		
		System.out.println(name.substring(2, 9));
		
		System.out.println(name.charAt(0));
		
		
	}

}
