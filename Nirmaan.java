package day11;

public class Nirmaan {
	public static void main(String[] args) {
		Employee E = new Employee("Shankar", 21, 9361136476L, "IT" );
		
		System.out.println(E.getName());
		System.out.println(E.getAge());
		System.out.println(E.getPhone());
		System.out.println(E.getDepartment());
		
		System.out.println(E);
		
		Employee E1 = new Employee();
		E1.setName("Surya");
		E1.setAge(34);
		E1.setPhone(9387474745l);
		E1.setDepartment("Cinema");
		
		System.out.println(E1.getName());
		System.out.println(E1.getAge());
		System.out.println(E1.getPhone());
		System.out.println(E1.getDepartment());
	}
	

}
