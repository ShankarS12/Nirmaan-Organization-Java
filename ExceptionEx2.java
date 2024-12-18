package day19;

import java.util.*;

public class ExceptionEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the first num:");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter the secondNum");
		int secondNum = sc.nextInt();
		
		int div = firstNum / secondNum;
		
		}
		
		catch(Exception E) {
			System.out.println(E);
		}
	}

}
