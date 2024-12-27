package day22;

import java.util.Scanner;
import java.util.*;
public class BookManagement2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		ArrayList<Book> al = new ArrayList<Book>();
		boolean isTrue = true;
		int choice;
		
		while(isTrue) {
			
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for remove");
			System.out.println("4 for show");
			System.out.println("0 for exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the id");
				int id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter the bookName");
				String bookName = sc.nextLine();
				
				System.out.println("Enter the author");
				String author = sc.nextLine();
				
				System.out.println("Enter the price");
				double price = sc.nextDouble();
				
				System.out.println("Enter the noofCopies");
				int copies = sc.nextInt();
				
				al.add(b = new Book( bookName, author, price, copies,id));
				
			}
			
			else if(choice == 2) {
				System.out.println("Enter the book id");
				int select = sc.nextInt();
				sc.nextLine();
				boolean isThere = false;
				for(Book b1 : al) {
					if(select == b1.getId()) {
						isThere = true;
						System.out.println("Enter the new book name");
						String newName = sc.nextLine();
						b1.setBookName(newName);
						
					}
				}
				
				if(!isThere) {
					System.out.println("Book not found!!");
				}
			}
			
			else if(choice == 3) {
				System.out.println("Enter the id");
				int id = sc.nextInt();
				boolean isThere = false;
				
				for(Book b2 : al) {
					if(id == b2.getId()) {
						isThere = true;
						System.out.println("Enter Book name : ");
						String name = sc.nextLine();
						al.get(al.indexOf(b2)).setBookName(name);
//						al.remove(b2.getAuthor());
						System.out.println("valu is removed");
						break;
					}
				}
				
				if(!isThere) {
					System.out.println("book not found");
				}
			}
			
			else if(choice==4) {
				System.out.println(al);
			}
			
			else if(choice == 0) {
				isTrue = false;
				System.out.println("program end \nThank you");
			}
		}
		
		

	}

}
