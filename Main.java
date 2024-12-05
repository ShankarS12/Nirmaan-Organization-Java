package day10;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("BMW");
		Car c2 = new Car("AUDI", 2001);
		
		c.displayCardDetails();
		c1.displayCardDetails();
		c2.displayCardDetails();
		
	}

}
