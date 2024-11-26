package day3;

import java.util.*;
public class Loops {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark");
		int mark = sc.nextInt();
		
		if(mark>=35) {
			if(mark>=90) {
				System.out.println("Grade A");
			}
			else if(mark>=80) {
				System.out.println("Grade B");
			}
			else {
				System.out.println("Grade C");
			}
		}
		else {
			System.out.println("fail");
		}
	}

}
