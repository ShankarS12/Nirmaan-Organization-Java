package day13;


	
	
class Animal{
		void makeSound() {
			System.out.println("This animal makes a sound");
		}
	}
	
	class Dog extends Animal{
		@Override
		void makeSound() {
			System.out.println("The dog barks");
		}	
	}
	
	class Cat extends Animal{
		@Override
		void makeSound() {
			System.out.println("The cat meows");
		}
	}
	public class SimpleInheritance {
	public static void main (String[]args) {
		Dog D = new Dog();
		D.makeSound();
		
		Cat C = new Cat();
		C.makeSound();
	}

}
