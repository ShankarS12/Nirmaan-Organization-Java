package day16;

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the firstnum for add");
		int firstNum = sc.nextInt();
		System.out.println("Enter the secondnum for add");
		int secondNum = sc.nextInt();
		
		System.out.println("Addition");
		System.out.println(calc.add(firstNum, secondNum));
		
		
		System.out.println("Subtraction");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		System.out.println(calc.sub(sub1, sub2));
		
		System.out.println("Multiplication");
		int mul1 = sc.nextInt();
		int mul2 = sc.nextInt();
		System.out.println(calc.mul(mul1, mul2));
		
		System.out.println("Division");
		int div1 = sc.nextInt();
		int div2 = sc.nextInt();
		System.out.println(calc.div(div1, div2));
	}
}
