package day17;

public class Bird implements IAnimal {
	
	public void move() {
		System.out.println("the bird flies in the sky");
	}
	
	public void speak() {
		System.out.println("the bird says: Chirp Chirp");
	}
	
	public static void main(String[] args) {
		Bird B = new Bird();
		B.speak();
		B.move();
		System.out.println(IAnimal.CATEGORY);
		System.out.println(IAnimal.isMammal("Elephant"));
	}

}
