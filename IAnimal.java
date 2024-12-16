package day17;

public interface IAnimal {
	
	public static final String CATEGORY = "Living Being";
	
	static boolean isMammal(String animalName) {
		return (animalName.equalsIgnoreCase("Dog"))||(animalName == "Cat")  || (animalName == "Human");
	}
	
	default void speak() {
		System.out.println("Animal is making a sound");
	}
	
	abstract void move();

}
