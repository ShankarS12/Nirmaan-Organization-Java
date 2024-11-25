package day2;
import java.util.*;
public class SimpleCalculator {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("0 for Add");
		System.out.println("1 for Sub");
		System.out.println("2 for Mul");
		System.out.println("3 for Div");
		System.out.println("4 for Mod");
		
		int Key = sc.nextInt();
//		
//		if(Key == 0)
//			System.out.println("Addition: " + (firstNum + secondNum));
//		
//		else if(Key == 1)
//			System.out.println("Subtraction: " + (firstNum - secondNum));
//		
//		else if(Key == 2)
//			System.out.println("Multiplication: " + (firstNum * secondNum));
//		
//		else if(Key == 3)
//			System.out.println("Division: " + (firstNum / secondNum));
//		
//		else if(Key == 4)
//			System.out.println("Modulus: " + (firstNum % secondNum));
//		
//		else 
//			System.out.println("Enter the correct choice");
		
		switch(Key) {
		case 0: 
			System.out.println("Addition: " + (firstNum + secondNum));
			break;
		case 1:
			System.out.println("Subtraction: " + (firstNum - secondNum));
			break;
		case 2:
			System.out.println("Multiplication: " + (firstNum * secondNum));
			break;
		case 3:
			System.out.println("Division: " + (firstNum / secondNum));
			break;
		case 4:
			System.out.println("Modulus: " + (firstNum % secondNum));
			break;
		default:
			System.out.println("Enter the correct Key");
		
			
		
		}
		
		
		
		
		
	}

}
