 
package day24;
import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		//HashSet<Book> HS = new HashSet<Book>();
		TreeSet<Book> TS = new TreeSet<Book>();
		Scanner sc = new Scanner(System.in);
		
		Book b = new Book(20,"Shankar", "JAVA");
		Book b1 = new Book(10,"Shankar", "JAVA");
		TS.add(b);
		TS.add(b1);
		System.out.println(TS);
		
		System.out.println(b.equals(b1));
		
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
				
				System.out.println("Enter the id");
				int id= sc.nextInt();
				
				System.out.println("Enter the author");
				String name = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter the name");
				String author = sc.nextLine();
				
				
				Book book = new Book(id, name, author);
				TS.add(book);
			}
			
			else if(choice == 4) {
				System.out.println(TS);
			}

}
	}
}
