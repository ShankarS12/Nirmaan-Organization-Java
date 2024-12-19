package day20;

public class ExceptionExp2 {
	
	//throws handle compile time or checked Exception
	//for method will throws exception from userdefined
	
	void div(int a, int b) throws Exception{
		System.out.println("Divide " + (a/b));
	}
	
	public static void main(String[] args) {
		ExceptionExp2 EE = new ExceptionExp2();
		try {
			EE.div(10, 0);
		}
		catch(Exception E) {
			System.out.println(E);
		}
		
	}
	

}
