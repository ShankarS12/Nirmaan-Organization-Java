package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> al = new ArrayList<Book>();
		
		boolean isTrue = true;
		
		int choice;
		
		while(isTrue) {
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for remove");
			System.out.println("4 for get");
			System.out.println("0 for exit");
			
			System.out.println("\nEnter your choice");
			choice = sc.nextInt();
			
			sc.nextLine();
			
			if(choice == 1) {
				
				System.out.println("Enter the bookName");
				String bookName = sc.nextLine();
				
				System.out.println("Enter the author");
				String author = sc.nextLine();
				
				System.out.println("Enter the price");
				double price = sc.nextDouble();
				
				System.out.println("Enter the noofCopies");
				int copies = sc.nextInt();
				
				al.add(book = new Book(bookName, author, price, copies));
			}
			
			else if(choice == 2) {
				System.out.println("Enter the bookName");
				String value  = sc.nextLine();
				boolean isThere = false;
				for(Book book1 : al) {
					if(value.equalsIgnoreCase(book1.getBookName())) {
						isThere = true;
						System.out.println("Enter the update book name");
						String newBook = sc.nextLine();
						book1.setBookName(newBook);
						
					}	
				}
			if(!isThere) {
				System.out.println("not there");
			}
			}
			
			else if(choice == 3) {
				System.out.println("Enter the bookName");
				String value  = sc.nextLine();
				boolean isThere = false;
				for(Book book2 : al) {
					if(value.equalsIgnoreCase(book2.getBookName())) {
						isThere = true;
						al.remove(book2);
						
					}	
				}
			if(!isThere) {
				System.out.println("not there");
			}
			}
				
			
			
			else if(choice == 4) {
				System.out.println(al);
			}
			
			else if(choice == 0) {
				isTrue = false;
				System.out.println("program end");
			}
			
			
			
		}
	}

}
