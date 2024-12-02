package day7;

import java.util.Scanner;

public class CalculatorTask {
	
	int add(int a, int b) {
		//System.out.println("Addition"+ (a+b));
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mul(int a, int b) {
		return a*b;
	}
	
	int div(int a, int b) {
		return a/b;
	}

	int mod(int a, int b) {
		return a%b;
	}
	
	public static void main(String args[]) {
		
			//Scanner sc = new Scanner(System.in);
			CalculatorTask calc = new CalculatorTask();
			
			
			int num1 = 	calc.add(10, 20);
			System.out.println(num1);
			
			int num2 = calc.sub(40, 20);
			System.out.println(num2);
			
			int num3 = calc.mul(10, 10);
			System.out.println(num3);
			
			int num4 = calc.div(100, 10);
			System.out.println(num4);
			
			int num5 = calc.mod(10, 2);
			System.out.println(num5);
			
			
			
			
			
			
		}
}
