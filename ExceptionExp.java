package day20;

import java.util.Scanner;

public class ExceptionExp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		try {
			int age = sc.nextInt();
			if(age > 0) {
				System.out.println(age);
			}
			else {
				throw new Exception();
			}
		}
		catch(ArithmeticException E) {
			System.out.println("Enter the crct age");	
		}
		catch(Exception E) {
			System.out.println(E);
		}
		finally {
			System.out.println("Always work");
		}
	}

}
