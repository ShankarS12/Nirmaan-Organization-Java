package day10;

public class Car{
	
	String make ;
	int year;
	
	Car(){
		make = "Unknown";
		year = 2000;
	}
	
	Car(String make){
		this.make = make;
		year = 2003;
	}
	
	Car(String make, int year){
		this.make = make;
		this.year = year;
	}
	
	void displayCardDetails() {
		System.out.println(make);
		System.out.println(year);
	}

}
