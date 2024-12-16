package day17;

public class Dog implements IAnimal {
	
	public void move() {
		System.out.println("the dog runs on four legs");
	}
	
	public void speak() {
		System.out.println("the dog says: Woof Woof");
	}
	
	public static void main(String [] args) {
		Dog D = new Dog();
		D.speak();
		D.move();
		System.out.println(IAnimal.CATEGORY);
		System.out.println(IAnimal.isMammal("fox"));
	}

}
