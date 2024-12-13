package day16;

public class Calculator implements ICalculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a , int b) {
		return a * b;
	}
	
	public int div(int a , int b) {
		return a / b;
	}

}
