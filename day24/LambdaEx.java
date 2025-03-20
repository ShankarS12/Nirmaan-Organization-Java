package day24;


public class LambdaEx {
	public static void main(String[] args) {

	int a =100;
	int b = 10;
	
	//lambda expressions
	
//  IIcalc c = (x,y)-> {
//		System.out.println(x-y);
//	};
//	c.sub(a,b);
	
	//Anonymous inner type
	
	IIcalc c = new IIcalc() {
		public void sub(int a,int b) {
			System.out.println(a-b);
		}
		
		public void mul(int a,int b) {
			System.out.println(a* b);
		}
		
		public String div(int a , int b) {
			return "Addition:"+ (a/b);
		}
	};
	
	c.sub(a, b);
	c.mul(a, b);
	
	}
}
