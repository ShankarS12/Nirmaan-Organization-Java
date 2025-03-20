package day25;

class Animal{
	void disp() {
		System.out.println("Animal sound");
	}
}
public class AnonymousEx {
	public static void main(String[] args) {
		Animal A = new Animal() {
			public void disp() {
				System.out.println("Dog sound");
			}
		};
		
		A.disp();
	}

}
