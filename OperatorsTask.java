package day1;

public class OperatorsTask {
	public static void main(String[] args) {
		
		int firstNum = 12;
		int secondNum = 25;
		
		System.out.println("Arithmetic Operations:");
		System.out.println("Addition: " + (firstNum + secondNum));
		System.out.println("Subtraction: " + (firstNum - secondNum));
		System.out.println("Multiplication: " + (firstNum * secondNum));
		System.out.println("Division: " + (firstNum / secondNum));
		System.out.println("Modulus: " + (firstNum % secondNum)); 
		
		System.out.println("Relational Operators: ");
	    System.out.println("12 > 25: " + (firstNum > secondNum));
	    System.out.println("12 < 25: " + (firstNum < secondNum));
	    System.out.println("12 >= 25: " + (firstNum >= secondNum));
	    System.out.println("12 <= 25: " + (firstNum <= secondNum));
	    System.out.println("12 == 25: " + (firstNum == secondNum));
	    System.out.println("12 != 25: " + (firstNum != secondNum));
	    
	    System.out.println("Assignment Operators: ");
	    
	    System.out.println("Logical Operators: ");
	    System.out.println("12 > 10 AND 25 > 50 : "+ ((12 > 10) && (25 < 50)));
	    System.out.println("12 < 5 OR 25 > 100 : "+ ((12 < 5) || (25 > 100)));
	    
	    System.out.println("Assignment Operators: ");
	    
	    int Value = 10;
	    System.out.println("Initial Value: " + Value);
	    System.out.println("After += : " + (Value += 12));
	    System.out.println("After -= : " + (Value -= 12));
	    System.out.println("After *= : " + (Value *= 12));
	    System.out.println("After /= : " + (Value /= 10));
	    System.out.println("After %= : " + (Value %= 12));
	    
	    System.out.println("Unary Operations: ");
	    int Number = 12; 
	    System.out.println("Initial Value: " + Number );
	    System.out.println("After Increment: " + ++Number);
	    System.out.println("After decrement: " + --Number);
		
	    
	    if((firstNum % 2) ==0 ) 
	    	System.out.println("12 is Even");
	    else
	    	System.out.println("odd");
	    
		
		
	}        

}
