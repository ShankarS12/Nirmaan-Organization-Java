package day11;

public class Employee {
	
	private String empName;
	private int empAge;
	private long empPhone;
	private String empDepartment;
	
	public Employee(){
		
	}
	
	public Employee(String empName, int empAge, long empPhone, String empDepartment){
		this.empName = empName;
		this.empAge = empAge;
		this.empPhone = empPhone;
		this.empDepartment = empDepartment;
	}
	
	public void setName(String empName ) {
		this.empName = empName;	
	}
	
	public void setAge(int empAge) {
		this.empAge = empAge;
	}
	
	public void setPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	
	public void setDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	public String getName() {
		return empName;
	}
	
	public int getAge() {
		return empAge;
	}
	
	public long getPhone() {
		return empPhone;
	}
	
	public String getDepartment() {
		return empDepartment;
	}
	
	public String toString() {
		return "Your name is : " + empName + "\n Your age is : " + empAge + "\nYour phone is : " + empPhone + "\nYour department is : " + empDepartment;
	}
	

}
