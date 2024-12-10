package day14;

import java.util.Scanner;

public class SingleEmployeeManagement {
	
	public static void main(String[] args) {
		Employee E = new Employee();
		Employee E1 = null;
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		int choice;
		
		while(isTrue) {
			System.out.println("Employee Management menu:");
			System.out.println("1. Add the employers.");
			System.out.println("2. Update the employers.");
			System.out.println("3. Display the employer details");
			System.out.println("   0 for exit");
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
			{
				System.out.println("Enter the id:");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name:");
				String name = sc.nextLine();
				
				System.out.println("Enter the phoneNo:");
				long phoneNo = sc.nextLong();
				sc.nextLine();
				
				System.out.println("Enter the department:");
				String department = sc.nextLine();
				
				E.setId(id);
				E.setName(name);
				E.setPhoneNo(phoneNo);
				E.setDepartment(department);
				
				System.out.println("Details updated");
				break;
			}
				
			case 2:
				
			{
				System.out.println("Enter the id:");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name:");
				String name = sc.nextLine();
				
				System.out.println("Enter the phoneNo:");
				long phoneNo = sc.nextLong();
				sc.nextLine();
				
				System.out.println("Enter the department:");
				String department = sc.nextLine();
				
			    E1 = new Employee(id,name,phoneNo,department);
			    
			    System.out.println("Details updated");
				break;
				
			}
			
			case 3:
				System.out.println(E);
				System.out.println(E1);
				break;
			
			case 0:
				isTrue = false;
				System.out.println("program exit.");
				break;
				
			default:
				System.out.println("Enter the correct choice");
				break;
				
		}
	}
	}
	}

 