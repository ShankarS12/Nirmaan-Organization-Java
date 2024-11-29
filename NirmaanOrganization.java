package day6;

public class NirmaanOrganization{
	
	int empId = 123;
	String empRole = "IT";
	int empAge = 21;
	String empSalary = "Twenty Thousand";
	
	void checkIn(String value){
		System.out.println(value);
	}
	
	void checkOut() {
		System.out.println("Leaved at evening");
	}
	
	public static void main(String[]args) {
		NirmaanOrganization NO = new NirmaanOrganization();
		
		System.out.println(NO.empId);
		System.out.println(NO.empRole);
		System.out.println(NO.empAge);
		System.out.println(NO.empSalary);
		
		System.out.println();
		
		NO.checkIn("Attendance marked");
		NO.checkOut();
		
		
		
	}

}
