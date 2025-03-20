package day26;

import java.util.*;

public class Management {
    public static void main(String[] args) {
        //HashSet<Employee> HS = new HashSet<Employee>();
        List<Employee> TS = new ArrayList<Employee>(); 
        		Scanner sc = new Scanner(System.in);

        Employee E2 ;
        E2 = new Employee(20,"Shankar", "JAVA");
        TS.add(E2);
        E2 = new Employee(10,"surya", "It");
        TS.add(E2);
       
        System.out.println(TS);

        //System.out.println(E.equals(E1));

        boolean isTrue = true;

        int choice;

        while(isTrue) {
            System.out.println("1 for add");
            System.out.println("2 for update");
            System.out.println("3 for remove");
            System.out.println("4 for get");
            System.out.println("5 for disp");

            
            System.out.println("0 for exit");

            System.out.println("\nEnter your choice");
            choice = sc.nextInt();

            sc.nextLine();

            if(choice == 1) {

                System.out.println("Enter the id");
                int id= sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the name");
                String name = sc.nextLine();


                System.out.println("Enter the department");
                String department = sc.nextLine();


                E2 = new Employee(id, name, department);
                TS.add(E2);
            }

            else if(choice == 2){
                System.out.println("Enter the id to update");
                int updateId = sc.nextInt();
                sc.nextLine();
                boolean isThere = false;

                for(Employee emp : TS) {
                    if(updateId == emp.getId()){
                    	isThere = true;
                        System.out.println("Enter the name to update");
                        String newName = sc.nextLine();

                        System.out.println("Enter the department to update");
                        String newDepartment = sc.nextLine();


                        emp.setName(newName);
                        emp.setDepartment(newDepartment);
                    }
                }
                if(!isThere) {
                	System.out.println("Value is not there!");
                }
                
            }

            else if(choice == 3){
                System.out.println("Enter the id to remove");
                int removeId = sc.nextInt();
                boolean isThere = false;

                for(Employee emp : TS){
                    if(removeId == emp.getId()){
                    	isThere = true;
                        TS.remove(emp);
                    }
                }
                if(!isThere) {
                	System.out.println("Value is not there!");
                }
            }

            else if(choice == 4) {
                System.out.println(TS);
            }
            else if(choice == 5) {
            	  System.out.println("Enter the id to display");
                  int dispId = sc.nextInt();
                  boolean isThere = false;

                  for(Employee emp : TS){
                      if(dispId == emp.getId()){
                      System.out.println(emp);
                      }
                  }
            }
            
            else if(choice == 0) {
            	isTrue = false;
            }


            else {
                System.out.println("Enter the correct choice!!");
            }
            
                       

        }
    }
}
