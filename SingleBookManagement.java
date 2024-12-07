package day12;

import java.util.Scanner;

public class SingleBookManagement {
	public static void main (String[]args) {
		Book B = new Book("Pyschology of money", "Housell", 1000, 10);
		Scanner sc = new Scanner(System.in);
		boolean isTrue=true;
		
		int choice;
		while(isTrue) {
			System.out.println("Book management menu:");
			System.out.println("1. Add/Update book details:");
			System.out.println("2. Display book details:");
			System.out.println("3. Exit.");
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			
			case 1: {
				System.out.println("Enter the book title:");
				String title = sc.nextLine();
				
				
				
				
				System.out.println("Enter the book author:");
				String author = sc.nextLine();
				
				System.out.println("Enter the price:");
				double price = sc.nextDouble();
				
				System.out.println("Enter the numberOfCopies:");
				int numberOfCopies = sc.nextInt();
				
				B.setTitle(title);
				B.setauthor(author);
				B.setPrice(price);
				B.setNumberOfCopies(numberOfCopies);
				
				System.out.println("Book details updated.");
				break;}
			
			case 2 :
				System.out.println( B.toString());
				isTrue=false;
				break;
			
			
			case 3: 
				System.out.println("program exit");
				isTrue=false;
				break;
			
			
			default:
				System.out.println("Enter the correct choice");
			
			}
		}
		
		
	}

}
