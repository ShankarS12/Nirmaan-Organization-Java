package day9;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int addAns = calc.add(10,20);
		System.out.println(addAns);
		
		int subAns = calc.sub(20,40);
		System.out.println(subAns);
		
		int mulAns = calc.mul(10,20 );
		System.out.println(mulAns);
		
		int divAns = calc.div(100, 10);
		System.out.println(divAns);
		
		int modAns = calc.mod(20, 2);
		System.out.println(modAns);
		
	}
}
